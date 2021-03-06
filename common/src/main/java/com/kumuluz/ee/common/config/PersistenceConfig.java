/*
 *  Copyright (c) 2014-2017 Kumuluz and/or its affiliates
 *  and other contributors as indicated by the @author tags and
 *  the contributor list.
 *
 *  Licensed under the MIT License (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  https://opensource.org/licenses/MIT
 *
 *  The software is provided "AS IS", WITHOUT WARRANTY OF ANY KIND, express or
 *  implied, including but not limited to the warranties of merchantability,
 *  fitness for a particular purpose and noninfringement. in no event shall the
 *  authors or copyright holders be liable for any claim, damages or other
 *  liability, whether in an action of contract, tort or otherwise, arising from,
 *  out of or in connection with the software or the use or other dealings in the
 *  software. See the License for the specific language governing permissions and
 *  limitations under the License.
*/
package com.kumuluz.ee.common.config;

import com.kumuluz.ee.common.utils.EnvUtils;

/**
 * @author Tilen Faganel
 * @since 1.0.0
 */
public class PersistenceConfig {

    public static final String DB_UNIT_ENV = "DATABASE_UNIT";

    public static final String DB_URL_ENV = "DATABASE_URL";

    public static final String DB_USER_ENV = "DATABASE_USER";

    public static final String DB_PASS_ENV = "DATABASE_PASS";

    private String unitName;

    private String url;

    private String username;

    private String password;

    public PersistenceConfig() {

        EnvUtils.getEnv(DB_UNIT_ENV, this::setUnitName);
        EnvUtils.getEnv(DB_URL_ENV, this::setUrl);
        EnvUtils.getEnv(DB_USER_ENV, this::setUsername);
        EnvUtils.getEnv(DB_PASS_ENV, this::setPassword);
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
