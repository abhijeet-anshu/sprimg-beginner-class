package com.abhijeet.practice.scratch5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
	@Inject //-> corresponds to Autowired
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCDIDAO) {
		this.someCdiDao = someCdiDao;
	}
	
}
