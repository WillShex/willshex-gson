//
//  Convert.java
//  spchopr.gson
//
//  Created by billy1380 on 27 Aug 2013.
//  Copyright © 2013 Spacehopper Studios Ltd. All rights reserved.
//

package com.willshex.gson.json.shared;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * @author billy1380
 * 
 */
public class Convert {
	public static JsonObject toJsonObject(String json) {
		JsonObject object = null;

		if (json != null) {
			JsonElement element = (new JsonParser()).parse(json);

			if (element != null && element.isJsonObject()) {
				object = element.getAsJsonObject();
			}
		}
		return object;
	}

	public static String fromJsonObject(JsonObject object) {
		String json = null;
		if (object != null) {
			json = object.toString();
		}
		return json;
	}
}
