package com.example.elmboot.controller;

import com.example.elmboot.entity.Oberallresult;
import com.example.elmboot.result.ListResult;
import com.example.elmboot.result.MessageResult;
import com.example.elmboot.result.SingleResult;
import com.example.elmboot.service.OberallresultService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("oberallresult")
@Api(value = "总检结论", tags = "总检结论")
public class OberallresultController {


    @Autowired
    private OberallresultService oberallresultService;


    @PostMapping("/add")
    @ApiOperation(value = "添加总检结论项")
    public MessageResult add(@RequestBody Oberallresult oberallresult){

        int add = oberallresultService.add(oberallresult);
        return new MessageResult(String.valueOf(add));
    }

    @PostMapping("/save")
    @ApiOperation(value = "修改总检结论项")
    public MessageResult save(@RequestBody Oberallresult oberallresult){

        int add = oberallresultService.save(oberallresult);
        return new MessageResult(String.valueOf(add));
    }

    @PostMapping("/delete")
    @ApiOperation(value = "删除总检结论项")
    public MessageResult delete(@RequestBody Oberallresult oberallresult){

        int add = oberallresultService.delete(oberallresult.getOrld());
        return new MessageResult(String.valueOf(add));
    }

    @PostMapping("/list")
    @ApiOperation(value = "查看总检结论项")
    public ListResult<Oberallresult> list(@RequestBody Oberallresult oberallresult){

        List<Oberallresult> oberallresults =
                oberallresultService.oberallList(oberallresult);

        return new ListResult<>(oberallresults);
    }

}
