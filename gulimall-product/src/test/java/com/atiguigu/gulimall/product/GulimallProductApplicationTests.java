package com.atiguigu.gulimall.product;

import com.atiguigu.gulimall.product.entity.BrandEntity;
import com.atiguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setDescript("哈哈哈");
//		brandEntity.setName("华为");
//		brandService.save(brandEntity);
//		System.out.println("bao cun cheng gong");
//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setBrandId(1L);
//		brandEntity.setDescript("huawei");
//		brandService.updateById(brandEntity);
//		System.out.println("修改成功！");

		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
		list.forEach((item)->{
			System.out.println(item);
		});

	}

}
