package wps.newsrussia.entities;

import java.sql.Date;

/**
 * Created by sergejsafonov on 11.05.16.
 */
public class Users {
    private long id;
    private String userLogin;
    private String userPass;
    private String userNickname;
    private String userEmail;
    private int groupIdGroup;
    private Date userRegistered;
    private int userStatus;
    private String displayName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getGroupIdGroup() {
        return groupIdGroup;
    }

    public void setGroupIdGroup(int groupIdGroup) {
        this.groupIdGroup = groupIdGroup;
    }

    public Date getUserRegistered() {
        return userRegistered;
    }

    public void setUserRegistered(Date userRegistered) {
        this.userRegistered = userRegistered;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (id != users.id) return false;
        if (groupIdGroup != users.groupIdGroup) return false;
        if (userStatus != users.userStatus) return false;
        if (userLogin != null ? !userLogin.equals(users.userLogin) : users.userLogin != null) return false;
        if (userPass != null ? !userPass.equals(users.userPass) : users.userPass != null) return false;
        if (userNickname != null ? !userNickname.equals(users.userNickname) : users.userNickname != null) return false;
        if (userEmail != null ? !userEmail.equals(users.userEmail) : users.userEmail != null) return false;
        if (userRegistered != null ? !userRegistered.equals(users.userRegistered) : users.userRegistered != null)
            return false;
        if (displayName != null ? !displayName.equals(users.displayName) : users.displayName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userLogin != null ? userLogin.hashCode() : 0);
        result = 31 * result + (userPass != null ? userPass.hashCode() : 0);
        result = 31 * result + (userNickname != null ? userNickname.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + groupIdGroup;
        result = 31 * result + (userRegistered != null ? userRegistered.hashCode() : 0);
        result = 31 * result + userStatus;
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        return result;
    }
}
