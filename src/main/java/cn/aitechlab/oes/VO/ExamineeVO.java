package cn.aitechlab.oes.VO;

import lombok.Data;

@Data
public class ExamineeVO {

    //考生学号
    public String examineeId;

    //考生名字
    public String examineeName;

    //身份证号
    public String identityNum;

    public Integer type;
}
