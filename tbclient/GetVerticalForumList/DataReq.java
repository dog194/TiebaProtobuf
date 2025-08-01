package tbclient.GetVerticalForumList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer begin_id;

    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.INT32)
    public final List<Integer> classid_list;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1471common;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pn;
    public static final List<Integer> DEFAULT_CLASSID_LIST = Collections.emptyList();
    public static final Integer DEFAULT_BEGIN_ID = 0;
    public static final Integer DEFAULT_PN = 0;

    public static final class Builder extends Message.Builder<DataReq> {
        public Integer begin_id;
        public List<Integer> classid_list;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1472common;
        public Integer pn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1472common = dataReq.f1471common;
            this.classid_list = Message.copyOf(dataReq.classid_list);
            this.begin_id = dataReq.begin_id;
            this.pn = dataReq.pn;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1471common = builder.f1472common;
            List<Integer> list = builder.classid_list;
            if (list == null) {
                this.classid_list = DEFAULT_CLASSID_LIST;
            } else {
                this.classid_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.begin_id;
            if (num == null) {
                this.begin_id = DEFAULT_BEGIN_ID;
            } else {
                this.begin_id = num;
            }
            Integer num2 = builder.pn;
            if (num2 == null) {
                this.pn = DEFAULT_PN;
                return;
            } else {
                this.pn = num2;
                return;
            }
        }
        this.f1471common = builder.f1472common;
        this.classid_list = Message.immutableCopyOf(builder.classid_list);
        this.begin_id = builder.begin_id;
        this.pn = builder.pn;
    }
}