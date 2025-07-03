package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class BdtSearchInfo extends Message {
    public static final String DEFAULT_BDT_RESULT_CONTENT = "";
    public static final String DEFAULT_BDT_THINK_CONTENT = "";

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bdt_result_content;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer bdt_result_status;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bdt_think_content;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer bdt_thread_num;
    public static final Integer DEFAULT_BDT_THREAD_NUM = 0;
    public static final Integer DEFAULT_BDT_RESULT_STATUS = 0;

    public static final class Builder extends Message.Builder<BdtSearchInfo> {
        public String bdt_result_content;
        public Integer bdt_result_status;
        public String bdt_think_content;
        public Integer bdt_thread_num;

        public Builder() {
        }

        public Builder(BdtSearchInfo bdtSearchInfo) {
            super(bdtSearchInfo);
            if (bdtSearchInfo == null) {
                return;
            }
            this.bdt_thread_num = bdtSearchInfo.bdt_thread_num;
            this.bdt_think_content = bdtSearchInfo.bdt_think_content;
            this.bdt_result_content = bdtSearchInfo.bdt_result_content;
            this.bdt_result_status = bdtSearchInfo.bdt_result_status;
        }

        @Override // com.squareup.wire.Message.Builder
        public BdtSearchInfo build(boolean z) {
            return new BdtSearchInfo(this, z);
        }
    }

    public BdtSearchInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.bdt_thread_num;
            if (num == null) {
                this.bdt_thread_num = DEFAULT_BDT_THREAD_NUM;
            } else {
                this.bdt_thread_num = num;
            }
            String str = builder.bdt_think_content;
            if (str == null) {
                this.bdt_think_content = "";
            } else {
                this.bdt_think_content = str;
            }
            String str2 = builder.bdt_result_content;
            if (str2 == null) {
                this.bdt_result_content = "";
            } else {
                this.bdt_result_content = str2;
            }
            Integer num2 = builder.bdt_result_status;
            if (num2 == null) {
                this.bdt_result_status = DEFAULT_BDT_RESULT_STATUS;
                return;
            } else {
                this.bdt_result_status = num2;
                return;
            }
        }
        this.bdt_thread_num = builder.bdt_thread_num;
        this.bdt_think_content = builder.bdt_think_content;
        this.bdt_result_content = builder.bdt_result_content;
        this.bdt_result_status = builder.bdt_result_status;
    }
}