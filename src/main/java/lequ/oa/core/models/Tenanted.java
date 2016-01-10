package lequ.oa.core.models;

import org.hibernate.annotations.Filter;

import javax.persistence.Basic;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Filter(name = "tenant")
public class Tenanted {

    @Basic
    private int teamId;
    
    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
   
}
