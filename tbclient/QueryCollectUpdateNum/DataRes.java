package tbclient.QueryCollectUpdateNum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_COLLECT_UPDATE_NUM = 0;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer collect_update_num;

    public static final class Builder extends Message.Builder<DataRes> {
        public Integer collect_update_num;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.collect_update_num = dataRes.collect_update_num;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.collect_update_num;
            if (num == null) {
                this.collect_update_num = DEFAULT_COLLECT_UPDATE_NUM;
                return;
            } else {
                this.collect_update_num = num;
                return;
            }
        }
        this.collect_update_num = builder.collect_update_num;
    }
}