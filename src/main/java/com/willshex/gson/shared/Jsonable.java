//
//  Jsonable.java
//  Scores
//
//  Created by William Shakour on August 16, 2011.
//  Copyright © 2011 WillShex Limited. All rights reserved.
//
package com.willshex.gson.shared;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.willshex.utility.JsonUtils;

public abstract class Jsonable {

	public JsonObject toJson () {
		return new JsonObject();
	}

	public void fromJson (JsonObject jsonObject) {
		return;
	}

	public void fromJson (String json) {
		JsonElement element = new JsonParser().parse(json);

		if (element.isJsonObject()) {
			fromJson(element.getAsJsonObject());
		} else {
			// was expecting json object or null
		}
	}

	@Override
	public String toString () {
		return JsonUtils.cleanJson(toJson().toString());
	}
}
