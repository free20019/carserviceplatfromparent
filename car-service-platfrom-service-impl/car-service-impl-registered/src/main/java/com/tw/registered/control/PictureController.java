package com.tw.registered.control;

import com.tw.entity.BackMessage;
import com.tw.registered.entity.PictureResp;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.UUID;

/**
 * Created by gaorui on 2017/12/14.
 */
@RestController
@Slf4j
public class PictureController {

    @PostMapping("/leavefile")
    @ApiOperation(value = "单图片上传")
    public String handleFileUploadleave(@RequestParam(value = "file")MultipartFile file ) {
        String path = "D:\\XHH\\pic\\";

        if (!file.isEmpty()) {
            try {
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(new File(
                                path+file.getOriginalFilename())));
                System.out.println(file.getName());
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "";
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
            return "上传成功";
        } else {
            return "图片信息为空";
        }
    }
    //, consumes = "multipart/form-data"
    @RequestMapping(value = "/fieldfilest", method = RequestMethod.POST,consumes = "multipart/*",headers = "content-type=multipart/form-data")
    @ApiOperation(value = "多图片上传")
    public  String  handleFileUpload(@RequestParam(value = "files") MultipartFile[] files) {
        log.info("myfiles="+files.length);
        String path = "D:\\XHH\\pic\\";
        String fileName = "";
        String msg = "";
        if (files != null && files.length > 0) {
            for (int i = 0; i < files.length; i++) {
                try {
                    fileName = files[i].getOriginalFilename();
                    byte[] bytes = files[i].getBytes();
                    BufferedOutputStream buffStream =
                            new BufferedOutputStream(new FileOutputStream(new File(path+ fileName)));
                    buffStream.write(bytes);
                    buffStream.close();
                    msg += "You have successfully uploaded " + fileName;
                } catch (Exception e) {
                    return "You failed to upload " + fileName + ": " + e.getMessage();
                }
            }
            return msg;
        } else {
            return "Unable to upload. File is empty.";
        }
    }
    /**
     * 上传多个文件
     * @param myfiles
     * @return
     */
    @RequestMapping(value = "/uploadFiles", method = RequestMethod.POST, consumes = "multipart/form-data")
    public String ArrayFiles(@RequestParam("files") MultipartFile[] myfiles ) {

        log.info("myfiles="+myfiles.length);
        try {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < myfiles.length; i++) {
                String filename = myfiles[i].getOriginalFilename();
                builder.append(filename + ", ");
                myfiles[i].transferTo(new File("D:\\XHH\\pic\\" + UUID.randomUUID() + "." + filename.substring(filename.lastIndexOf(".") + 1)));
            }
        } catch (IllegalStateException | IOException e) {
            e.printStackTrace();
        }
        return "result";

    }

}
