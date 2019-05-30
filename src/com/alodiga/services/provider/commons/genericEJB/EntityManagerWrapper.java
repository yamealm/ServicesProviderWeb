package com.alodiga.services.provider.commons.genericEJB;

import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.alodiga.services.provider.commons.utils.QueryConstants;
import com.alodiga.services.provider.commons.utils.QueryParam;

public class EntityManagerWrapper<T> {

    protected EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public T save(T t) {
        entityManager.persist(t);
        return t;
    }

    public T load(Class<T> entityClass, Object PK) {
        return (T) entityManager.find(entityClass, PK);
    }

    public T update(T t) {
        return entityManager.merge(t);
    }

    public void delete(T t) {
        t = entityManager.merge(t);
        entityManager.remove(t);
    }

    public List<T> get(Class<T> t, Integer first, Integer limit) {
        String sql = "SELECT t FROM " + t.getSimpleName() + " AS t ";
        Query q = entityManager.createQuery(sql);
        if (first != null && first > 0) {
            q.setFirstResult(first);
        }
        if (limit != null && limit > 0) {
            q.setMaxResults(limit);
        }
        return q.getResultList();
    }

    public List<T> findByNamedQuery(String name, Map<String, ? extends Object> params, Integer first, Integer limit) {
        Query query = entityManager.createNamedQuery(name);

        for (Map.Entry<String, ? extends Object> param : params.entrySet()) {
            query.setParameter(param.getKey(), param.getValue());
        }

        if (first != null && first > 0) {
            query.setFirstResult(first);
        }
        if (limit != null && limit > 0) {
            query.setMaxResults(limit);
        }

        final List<T> result = (List<T>) query.setHint("toplink.refresh", "true").getResultList();
        return result;
    }

    public void executeNamedQuery(String name, Map<String, ? extends Object> params) {
        Query query = entityManager.createNamedQuery(name);
        for (Map.Entry<String, ? extends Object> param : params.entrySet()) {
            query.setParameter(param.getKey(), param.getValue());
        }
        query.executeUpdate();
    }

    public Object executeSearchQuery(Class<T> t, Map<String, ? extends Object> andParams, Map<String, ? extends Object> orderParams, Integer first, Integer limit, boolean isFilter) {
        String sql = "SELECT t FROM " + t.getSimpleName() + " AS t ";
        if (!andParams.entrySet().isEmpty()) {
            sql += "WHERE ";
        }
        int i = 0;
        int andSize = andParams.size();
        String condition = !isFilter ? " OR " : " AND ";

        for (Map.Entry<String, ? extends Object> param : andParams.entrySet()) {
            String operator = QueryConstants.EQUAL;
            String key = getCurrentForeignFieldName(param.getKey());
            Object value = param.getValue();
            if (value instanceof QueryParam) {
                QueryParam qp = (QueryParam) value;
                operator = qp.getOperator();
                if (value == null || value == "null") {
                    value = "";
                } else {
                    value = qp.getValue();
                }
            }
            sql += value instanceof String ? key + operator + (operator.equals(QueryConstants.LIKE) ? "'%" + value + "%'" : "'" + value + "'") : key + operator + value;
            if (andSize > 1 && i < andSize - 1) {
                sql += condition;
            }
            i++;

        }
        if (orderParams != null && orderParams.size() > 0) {
            int orderSize = orderParams.size();
            if (orderSize > 0) {
                sql += " ORDER BY ";
            }
            i = 0;
            for (Map.Entry<String, ? extends Object> param : orderParams.entrySet()) {

                String key = getCurrentForeignFieldName(param.getKey());
                Object value = param.getValue();
                sql += key + " " + value;
                if (orderSize > 1 && i < orderSize - 1) {
                    sql += " , ";
                }
                i++;
            }
        }
        Query query = entityManager.createQuery(sql);
        if (first != null && first > 0) {
            query.setFirstResult(first);
        }
        if (limit != null && limit > 0) {
            query.setMaxResults(limit);
        }
        return query.getResultList();
    }

    public Query createQuery(String sql) {

        return entityManager.createQuery(sql);
    }

    public void setEntityManager(EntityManager em) {
        entityManager = em;
    }

    private String getCurrentForeignFieldName(String key) {
        String aux = null;
        if (key.contains("Id")) {
            aux = key.replace("Id", ".id");
            key = aux;
        }
        key = "t." + key;
        return key;

    }
}
