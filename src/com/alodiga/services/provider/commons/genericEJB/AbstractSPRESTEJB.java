package com.alodiga.services.provider.commons.genericEJB;

import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.utils.DistributionWSMediaType;
import com.alodiga.services.provider.commons.utils.DocumentHandler;

public class AbstractSPRESTEJB extends AbstractSPEJB {

	private RestTemplate restTemplate;

	public AbstractSPRESTEJB() {
		restTemplate = new RestTemplate();
	}

	protected String loadData(Class clazz, EJBRequest request, Logger logger, String methodName) throws NullParameterException {
		if (request == null) {
			throw new NullParameterException( "", null);
		}
		DistributionWSMediaType distMediaType = request.getMediaType();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType(distMediaType.getType(), distMediaType.getSubtype()));
		//LinkedMultiValueMap parameters = new LinkedMultiValueMap();
		//parameters.setAll(request.getParams());
		//HttpEntity httpRequest = new HttpEntity(parameters, headers);
	//	ResponseEntity<String> responseEntity = restTemplate.exchange(request.getUrl(), request.getMethod(), httpRequest, String.class);
		String data ="1123";/* responseEntity.getBody();*/
		//persistAuditData(EventTypeEnum.READ, data, request.getAuditData());
		return data;
	}

	protected Object parseObject(String o, Class clazz) {
		return DocumentHandler.objectFromXml(o, clazz);
	}
}
