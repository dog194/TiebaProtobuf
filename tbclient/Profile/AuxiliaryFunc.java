package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedKV;

/* loaded from: classes4.dex */
public final class AuxiliaryFunc extends Message {

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<AuxiliaryAllTools> all_tools;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedKV> log_param;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<AuxiliaryToolsInfo> outside_tools;
    public static final List<AuxiliaryToolsInfo> DEFAULT_OUTSIDE_TOOLS = Collections.emptyList();
    public static final List<AuxiliaryAllTools> DEFAULT_ALL_TOOLS = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();

    public static final class Builder extends Message.Builder<AuxiliaryFunc> {
        public List<AuxiliaryAllTools> all_tools;
        public List<FeedKV> log_param;
        public List<AuxiliaryToolsInfo> outside_tools;

        public Builder() {
        }

        public Builder(AuxiliaryFunc auxiliaryFunc) {
            super(auxiliaryFunc);
            if (auxiliaryFunc == null) {
                return;
            }
            this.outside_tools = Message.copyOf(auxiliaryFunc.outside_tools);
            this.all_tools = Message.copyOf(auxiliaryFunc.all_tools);
            this.log_param = Message.copyOf(auxiliaryFunc.log_param);
        }

        @Override // com.squareup.wire.Message.Builder
        public AuxiliaryFunc build(boolean z) {
            return new AuxiliaryFunc(this, z);
        }
    }

    public AuxiliaryFunc(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<AuxiliaryToolsInfo> list = builder.outside_tools;
            if (list == null) {
                this.outside_tools = DEFAULT_OUTSIDE_TOOLS;
            } else {
                this.outside_tools = Message.immutableCopyOf(list);
            }
            List<AuxiliaryAllTools> list2 = builder.all_tools;
            if (list2 == null) {
                this.all_tools = DEFAULT_ALL_TOOLS;
            } else {
                this.all_tools = Message.immutableCopyOf(list2);
            }
            List<FeedKV> list3 = builder.log_param;
            if (list3 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
                return;
            } else {
                this.log_param = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.outside_tools = Message.immutableCopyOf(builder.outside_tools);
        this.all_tools = Message.immutableCopyOf(builder.all_tools);
        this.log_param = Message.immutableCopyOf(builder.log_param);
    }
}