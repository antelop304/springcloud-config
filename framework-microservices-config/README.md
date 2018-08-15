# 统一配置中心 使用说明
## 添加相关依赖包

```$xslt
<dependencies>
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-config-server</artifactId>
    </dependency>
</dependencies>
```

## 添加bootstrap.yml 配置文件

```yaml
spring:
  application:
    name: 
  cloud:
    config:
      profile: default
      label: develop
      discovery:
        enabled: true         # 默认false，设为true表示使用注册中心中的configserver配置而不自己配置configserver的uri
        serviceId: microservices-config  # 指定config server在服务发现中的serviceId，默认为：configserver
eureka:
  client:
    serviceUrl:
      defaultZone: http://node5.simba.pro:8012/eureka,http://node5.simba.pro:8012/eureka,http://node5.simba.pro:8012/eureka
```

## 远程配置文件查看规则 

- /{application}/{profile}[/{label}]
- /{application}-{profile}.yml
- /{label}/{application}-{profile}.yml
- /{application}-{profile}.properties
- /{label}/{application}-{profile}.properties
