package com.micro.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.config.EnableAdminServer;

@Configuration
@EnableAdminServer
@EnableDiscoveryClient
@EnableAutoConfiguration
public class AdminApplication {

/*  @Bean
  public Config hazelcastConfig() {
    return new Config().setProperty("hazelcast.jmx", "true")
        .addMapConfig(new MapConfig("spring-boot-admin-application-store").setBackupCount(1)
            .setEvictionPolicy(EvictionPolicy.NONE))
        .addListConfig(new ListConfig("spring-boot-admin-event-store").setBackupCount(1)
            .setMaxSize(1000));
  }*/

  public static void main(String[] args) {
    SpringApplication.run(AdminApplication.class, args);
  }
}