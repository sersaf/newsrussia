package wps.newsrussia.entities;

/**
 * Created by sergejsafonov on 12.05.16.
 */
public class Group {
    private int idGroup;
    private String groupName;

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (idGroup != group.idGroup) return false;
        if (groupName != null ? !groupName.equals(group.groupName) : group.groupName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGroup;
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        return result;
    }
}
