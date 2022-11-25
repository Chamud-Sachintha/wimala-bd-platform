package com.example.wimalabdplatform.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agent")
public class AgentDTO {
    @Id
    private String agentRefNo;
    private String agentname;
    private String agentNicNumber;
    private String agentLocation;

    public String getAgentRefNo() {
        return agentRefNo;
    }

    public void setAgentRefNo(String agentRefNo) {
        this.agentRefNo = agentRefNo;
    }

    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    public String getAgentNicNumber() {
        return agentNicNumber;
    }

    public void setAgentNicNumber(String agentNicNumber) {
        this.agentNicNumber = agentNicNumber;
    }

    public String getAgentLocation() {
        return agentLocation;
    }

    public void setAgentLocation(String agentLocation) {
        this.agentLocation = agentLocation;
    }
}
