package com.perfsdk.example;

import auto.SDK;
import entity.ExcuteElement;
import util.StreamUtil;

import java.io.IOException;

public class ClickTask {
    public static void main(String[] args) throws InterruptedException, IOException {
        SDK sdk = new SDK();
        // 设备序号替换自己的udId
        ExcuteElement element = new ExcuteElement("设备序号",100,"43","adb",
                8L,"click", "淘宝");
        String mp4Path = sdk.startRecord(element);
        if(!StreamUtil.isEmpty(mp4Path)){
            sdk.performParsing(mp4Path,element.getAlgorithmId(),false);
        }
    }
}
