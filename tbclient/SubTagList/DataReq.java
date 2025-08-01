package tbclient.SubTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final List<Integer> DEFAULT_ARR_TAG_ID = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT32)
    public final List<Integer> arr_tag_id;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1545common;

    public static final class Builder extends Message.Builder<DataReq> {
        public List<Integer> arr_tag_id;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1546common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1546common = dataReq.f1545common;
            this.arr_tag_id = Message.copyOf(dataReq.arr_tag_id);
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1545common = builder.f1546common;
            List<Integer> list = builder.arr_tag_id;
            if (list == null) {
                this.arr_tag_id = DEFAULT_ARR_TAG_ID;
                return;
            } else {
                this.arr_tag_id = Message.immutableCopyOf(list);
                return;
            }
        }
        this.f1545common = builder.f1546common;
        this.arr_tag_id = Message.immutableCopyOf(builder.arr_tag_id);
    }
}