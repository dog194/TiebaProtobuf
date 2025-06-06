package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class BrandSign extends Message {
    public static final String DEFAULT_EXT = "";

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer count;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ext;

    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<BrandAward> sign_detail;

    @ProtoField(tag = 1, type = Message.Datatype.BOOL)
    public final Boolean signed;
    public static final Boolean DEFAULT_SIGNED = Boolean.FALSE;
    public static final Integer DEFAULT_COUNT = 0;
    public static final List<BrandAward> DEFAULT_SIGN_DETAIL = Collections.emptyList();

    public static final class Builder extends Message.Builder<BrandSign> {
        public Integer count;
        public String ext;
        public List<BrandAward> sign_detail;
        public Boolean signed;

        public Builder() {
        }

        public Builder(BrandSign brandSign) {
            super(brandSign);
            if (brandSign == null) {
                return;
            }
            this.signed = brandSign.signed;
            this.count = brandSign.count;
            this.ext = brandSign.ext;
            this.sign_detail = Message.copyOf(brandSign.sign_detail);
        }

        @Override // com.squareup.wire.Message.Builder
        public BrandSign build(boolean z) {
            return new BrandSign(this, z);
        }
    }

    public BrandSign(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Boolean bool = builder.signed;
            if (bool == null) {
                this.signed = DEFAULT_SIGNED;
            } else {
                this.signed = bool;
            }
            Integer num = builder.count;
            if (num == null) {
                this.count = DEFAULT_COUNT;
            } else {
                this.count = num;
            }
            String str = builder.ext;
            if (str == null) {
                this.ext = "";
            } else {
                this.ext = str;
            }
            List<BrandAward> list = builder.sign_detail;
            if (list == null) {
                this.sign_detail = DEFAULT_SIGN_DETAIL;
                return;
            } else {
                this.sign_detail = Message.immutableCopyOf(list);
                return;
            }
        }
        this.signed = builder.signed;
        this.count = builder.count;
        this.ext = builder.ext;
        this.sign_detail = Message.immutableCopyOf(builder.sign_detail);
    }
}