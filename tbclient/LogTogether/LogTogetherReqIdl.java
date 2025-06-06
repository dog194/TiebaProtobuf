package tbclient.LogTogether;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class LogTogetherReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<LogTogetherReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(LogTogetherReqIdl logTogetherReqIdl) {
            super(logTogetherReqIdl);
            if (logTogetherReqIdl == null) {
                return;
            }
            this.data = logTogetherReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public LogTogetherReqIdl build(boolean z) {
            return new LogTogetherReqIdl(this, z);
        }
    }

    public LogTogetherReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}