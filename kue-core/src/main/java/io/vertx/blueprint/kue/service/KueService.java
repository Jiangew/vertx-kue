package io.vertx.blueprint.kue.service;

import io.vertx.blueprint.kue.service.impl.KueServiceImpl;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.Vertx;
import io.vertx.serviceproxy.ProxyHelper;

/**
 * Vert.x Blueprint - Job Queue
 * Kue Service Interface
 *
 * @author Eric Zhao
 */
@ProxyGen
@VertxGen
public interface KueService {

  static KueService create(Vertx vertx) {
    return new KueServiceImpl();
  }

  static KueService createProxy(Vertx vertx, String address) {
    return ProxyHelper.createProxy(KueService.class, vertx, address);
  }
}
