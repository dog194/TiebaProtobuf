package tbclient.ItemManage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_GAME_ID = "";

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1481common;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String game_id;

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer pn;

    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer rn;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer tab_id;
    public static final Integer DEFAULT_TAB_ID = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1482common;
        public String game_id;
        public Integer pn;
        public Integer rn;
        public Integer tab_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1482common = dataReq.f1481common;
            this.tab_id = dataReq.tab_id;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
            this.game_id = dataReq.game_id;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1481common = builder.f1482common;
            Integer num = builder.tab_id;
            if (num == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = num;
            }
            Integer num2 = builder.pn;
            if (num2 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num2;
            }
            Integer num3 = builder.rn;
            if (num3 == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num3;
            }
            String str = builder.game_id;
            if (str == null) {
                this.game_id = "";
                return;
            } else {
                this.game_id = str;
                return;
            }
        }
        this.f1481common = builder.f1482common;
        this.tab_id = builder.tab_id;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.game_id = builder.game_id;
    }
}