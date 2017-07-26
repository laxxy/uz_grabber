package net.uz.core.context;

/**
 * Created by Никита Овсянников on 06.07.2017.
 */
public class Credentials {

    private boolean rememberMe;

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    /*public void setBearer(String bearer) {
        this.bearer = "Bearer " + Func.REGEXP_SUBSTRING.apply("profileImage=([\\d\\D]+)&uname", bearer);
    }*/
}
