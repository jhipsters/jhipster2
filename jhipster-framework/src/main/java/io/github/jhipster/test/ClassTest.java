package io.github.jhipster.test;

import java.lang.reflect.Field;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

//@ApiIgnore
@RestController
@RequestMapping("/topic")
public class ClassTest {
	
	@PostMapping("/unittest")
	public ResponseEntity<String> unitest(@RequestParam("code") Integer code) {
		try {
			Class<?> cls = Class.forName("com.archie.schedule.BatchTaixiuBonus");
			Field fld = cls.getField("taiAmountOld");
			//Field fld2 = cls.getField("max");
			fld.set(cls, 10);
//	Integer isSuccess = batchTx.setCode(code);
//	if (isSuccess.intValue() == 0 || isSuccess.intValue() == 1) {
//		result = new BaseResponse<>(Constants.OK, " successfully ", isSuccess);
//	}else {
//		result = new BaseResponse<>(Constants.FAIL,  "" ,isSuccess);
//	}
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
		}
		return new ResponseEntity<String>("", HttpStatus.OK);
	}
}
