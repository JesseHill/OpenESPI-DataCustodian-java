/*
 * Copyright 2013, 2014, 2015 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.energyos.espi.datacustodian.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Set;

public class URLHelper {

	public static String newScopeParams(String[] scopes) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < scopes.length; i++) {
			if (i > 0)
				sb.append("&");
			try {
				sb.append("scope=" + URLEncoder.encode(scopes[i], "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}

	public static String newScopeParams(Set<String> scopes) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (String scope : scopes) {
			if (i > 0)
				sb.append("&");
			try {
				sb.append("scope=" + URLEncoder.encode(scope, "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			i++;
		}
		return sb.toString();
	}
}
