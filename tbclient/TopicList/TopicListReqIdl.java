package tbclient.TopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class TopicListReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<TopicListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(TopicListReqIdl topicListReqIdl) {
            super(topicListReqIdl);
            if (topicListReqIdl == null) {
                return;
            }
            this.data = topicListReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public TopicListReqIdl build(boolean z) {
            return new TopicListReqIdl(this, z);
        }
    }

    public TopicListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}