package com.tw.parade.feigns;

import com.tw.service.CarRegisteredApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author ${H_H}
 * @DATE 2019-05-15
 * @TIME 14:07
 */
@FeignClient(name = "app-tw-registered")
public interface ParadeFeign extends CarRegisteredApi {

}
