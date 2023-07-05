package io.edurt.datacap.service.entity;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import io.edurt.datacap.common.enums.State;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.sql.Timestamp;

@Data
@ToString
@NoArgsConstructor
@Entity
@Table(name = "audit_plugin")
@org.hibernate.annotations.Table(appliesTo = "audit_plugin", comment = "The user records the execution log and history of the plug-in")
@SuppressFBWarnings(value = {"EI_EXPOSE_REP"},
        justification = "I prefer to suppress these FindBugs warnings")
public class PluginAuditEntity
{
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "state", unique = true)
    @Enumerated(EnumType.STRING)
    private State state;

    @Column(name = "content", unique = true)
    private String content;

    @Column(name = "message", unique = true)
    private String message;

    @Column(name = "create_time", columnDefinition = "datetime(5) default CURRENT_TIMESTAMP()")
    private Timestamp createTime;

    @Column(name = "end_time", columnDefinition = "datetime(5) default CURRENT_TIMESTAMP()")
    private Timestamp endTime;

    @Column(name = "elapsed")
    private Long elapsed;

    @Column(name = "count")
    private int count;

    @ManyToOne
    @JoinColumn(name = "plugin_id")
    @JsonIncludeProperties(value = {"id", "name", "type"})
    private SourceEntity plugin;

    // Add from 1.1.0.20221115
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIncludeProperties(value = {"id", "username"})
    private UserEntity user;

    public void setEndTime(Timestamp endTime)
    {
        this.endTime = endTime;
        this.elapsed = this.endTime.getTime() - this.createTime.getTime();
    }
}
