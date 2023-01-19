package com.eolink.common.controller;

import com.eolink.common.domain.dto.BaseResponse;
import com.eolink.common.enumeration.ErrorCodeEnums;
import com.eolink.common.exception.ApiException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Map;

/**
 * 示例
 * @author sunanzhi work
 */
@RestController
@Slf4j
@RequestMapping("/common/example")
public class ExampleController {

    /**
     * 优路官网
     */
    public static final String YOULU_WEB_CTYPE = "YOULU.WEB";

    @PostMapping("/test")
    public BaseResponse<String> test(@ApiParam(value = "我是参数1", defaultValue = "我是默认解释") @NotBlank String param1,
                                     @ApiParam(value = "我是参数2") @NotEmpty(message = "hhhh") Long param2,
                                     Float param3,
                                     String paramStr,
                                     @NotEmpty(message = "hhhh") List<Map< String, List<Map<String, Object>>>> mapMap,
                                     List<Map< String, List<Map<String, Object>>>> mapMap33,
                                     @ApiParam("我是mapMap2") @NotEmpty(message = "hhhh") @NotBlank List<Map< String, List<Map<String, Object>>>> mapMap2,
                                     @ApiParam(value = "我是参数4") int param4) {
        return BaseResponse.success("im string");
    }

    @PostMapping("/add")
    public BaseResponse<String> add(@ApiParamBody McMt mcMt,
                                    @ApiParamBody("mtc") @NotEmpty(message = "消息模板通道不能为空") @Valid List<Map<String, Object>> mtc,
                                    @ApiParam(value = "消息策略") @IsId @Length(max = 36) String strategyId,
                                    @ApiParam(value = "创建人标识") @IsId @Length(max = 36) @NotBlank(message = "创建人标识不能为空") String mtCreator) {
        return BaseResponse.success("im string");
    }
}
