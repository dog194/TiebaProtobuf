package tbclient.LogTogether;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final List<AdReq> DEFAULT_AD = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<AdReq> Ad;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 2)
    public final CommonReq f1478common;

    public static final class Builder extends Message.Builder<DataReq> {
        public List<AdReq> Ad;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1479common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.Ad = Message.copyOf(dataReq.Ad);
            this.f1479common = dataReq.f1478common;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<AdReq> list = builder.Ad;
            if (list == null) {
                this.Ad = DEFAULT_AD;
            } else {
                this.Ad = Message.immutableCopyOf(list);
            }
            this.f1478common = builder.f1479common;
            return;
        }
        this.Ad = Message.immutableCopyOf(builder.Ad);
        this.f1478common = builder.f1479common;
    }
}