package action;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport{

    @Override
    public String execute(){
        
        System.out.println("�÷���ΪĬ�Ϸ�����struts2�Զ�����");
        
        return "success";
    }
}