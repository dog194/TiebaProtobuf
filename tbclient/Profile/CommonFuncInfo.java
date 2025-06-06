package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedKV;

/* loaded from: classes4.dex */
public final class CommonFuncInfo extends Message {
    public static final List<CommonFunc> DEFAULT_COMMON_FUNC_NORAML = Collections.emptyList();
    public static final List<CommonFunc> DEFAULT_COMMON_FUNC_OTHER = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<CommonFunc> common_func_noraml;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<CommonFunc> common_func_other;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedKV> log_param;

    public static final class Builder extends Message.Builder<CommonFuncInfo> {
        public List<CommonFunc> common_func_noraml;
        public List<CommonFunc> common_func_other;
        public List<FeedKV> log_param;

        public Builder() {
        }

        public Builder(CommonFuncInfo commonFuncInfo) {
            super(commonFuncInfo);
            if (commonFuncInfo == null) {
                return;
            }
            this.common_func_noraml = Message.copyOf(commonFuncInfo.common_func_noraml);
            this.common_func_other = Message.copyOf(commonFuncInfo.common_func_other);
            this.log_param = Message.copyOf(commonFuncInfo.log_param);
        }

        @Override // com.squareup.wire.Message.Builder
        public CommonFuncInfo build(boolean z) {
            return new CommonFuncInfo(this, z);
        }
    }

    public CommonFuncInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<CommonFunc> list = builder.common_func_noraml;
            if (list == null) {
                this.common_func_noraml = DEFAULT_COMMON_FUNC_NORAML;
            } else {
                this.common_func_noraml = Message.immutableCopyOf(list);
            }
            List<CommonFunc> list2 = builder.common_func_other;
            if (list2 == null) {
                this.common_func_other = DEFAULT_COMMON_FUNC_OTHER;
            } else {
                this.common_func_other = Message.immutableCopyOf(list2);
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
        this.common_func_noraml = Message.immutableCopyOf(builder.common_func_noraml);
        this.common_func_other = Message.immutableCopyOf(builder.common_func_other);
        this.log_param = Message.immutableCopyOf(builder.log_param);
    }
}