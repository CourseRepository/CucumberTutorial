package com.api.cucumber.transform;

import cucumber.api.Transformer;

public class TransformData extends Transformer<String> {

	@Override
	public String transform(String args) {
		return args + " Transform";
	}

}
