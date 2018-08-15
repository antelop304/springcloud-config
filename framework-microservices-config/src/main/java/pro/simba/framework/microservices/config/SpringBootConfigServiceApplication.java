/**
 * Copyright © 2017-2018 Beijing Audiotone Technology Co.,Ltd.
 * All Rights Reserved.
 * This software is the confidential and proprietary information of
 * Beijing Audiotone Technology Co.,Ltd.
 * ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with Audiotone.
 * AUDIOTONE MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. AUDIOTONE SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package pro.simba.framework.microservices.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.tmatesoft.svn.core.wc2.SvnOperationFactory;

/**********************************************************
 * Copyright © 2016,北京世纪奥通科技有限公司
 * All Rights Reserved.
 * 文件名称： SpringBootApplication.java
 * 摘 要： [简要描述本文件的内容]
 * 初始版本：1.0.0
 * 原 作 者：lichangkang
 * 完成日期： 2017年1月14日 上午10:36:26
 * 当前版本： 1.0.0
 * 作 者：lichangkang
 * 完成日期： 2017年1月14日 上午10:36:26
 *****************************************************************/
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringBootConfigServiceApplication {
    
    /**
     * 启动主类.
     * 
     * @param args
     *            参数
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootConfigServiceApplication.class)
            .run(args);
    }
}
