package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AgentInfo extends Message {
    public static final Integer DEFAULT_AGENT_NUM = 0;
    public static final String DEFAULT_AGENT_PAGE = "";

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer agent_num;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String agent_page;

    public static final class Builder extends Message.Builder<AgentInfo> {
        public Integer agent_num;
        public String agent_page;

        public Builder() {
        }

        public Builder(AgentInfo agentInfo) {
            super(agentInfo);
            if (agentInfo == null) {
                return;
            }
            this.agent_num = agentInfo.agent_num;
            this.agent_page = agentInfo.agent_page;
        }

        @Override // com.squareup.wire.Message.Builder
        public AgentInfo build(boolean z) {
            return new AgentInfo(this, z);
        }
    }

    public AgentInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.agent_num;
            if (num == null) {
                this.agent_num = DEFAULT_AGENT_NUM;
            } else {
                this.agent_num = num;
            }
            String str = builder.agent_page;
            if (str == null) {
                this.agent_page = "";
                return;
            } else {
                this.agent_page = str;
                return;
            }
        }
        this.agent_num = builder.agent_num;
        this.agent_page = builder.agent_page;
    }
}