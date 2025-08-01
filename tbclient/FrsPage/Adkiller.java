package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Adkiller extends Message {
    public static final String DEFAULT_HINT_URL = "";

    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer ad_left_num;

    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<AdkillerAd> ad_list;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String hint_url;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer show_ad;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer show_hint;
    public static final Integer DEFAULT_SHOW_HINT = 0;
    public static final Integer DEFAULT_SHOW_AD = 0;
    public static final Integer DEFAULT_AD_LEFT_NUM = 0;
    public static final List<AdkillerAd> DEFAULT_AD_LIST = Collections.emptyList();

    public static final class Builder extends Message.Builder<Adkiller> {
        public Integer ad_left_num;
        public List<AdkillerAd> ad_list;
        public String hint_url;
        public Integer show_ad;
        public Integer show_hint;

        public Builder() {
        }

        public Builder(Adkiller adkiller) {
            super(adkiller);
            if (adkiller == null) {
                return;
            }
            this.show_hint = adkiller.show_hint;
            this.show_ad = adkiller.show_ad;
            this.hint_url = adkiller.hint_url;
            this.ad_left_num = adkiller.ad_left_num;
            this.ad_list = Message.copyOf(adkiller.ad_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public Adkiller build(boolean z) {
            return new Adkiller(this, z);
        }
    }

    public Adkiller(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.show_hint;
            if (num == null) {
                this.show_hint = DEFAULT_SHOW_HINT;
            } else {
                this.show_hint = num;
            }
            Integer num2 = builder.show_ad;
            if (num2 == null) {
                this.show_ad = DEFAULT_SHOW_AD;
            } else {
                this.show_ad = num2;
            }
            String str = builder.hint_url;
            if (str == null) {
                this.hint_url = "";
            } else {
                this.hint_url = str;
            }
            Integer num3 = builder.ad_left_num;
            if (num3 == null) {
                this.ad_left_num = DEFAULT_AD_LEFT_NUM;
            } else {
                this.ad_left_num = num3;
            }
            List<AdkillerAd> list = builder.ad_list;
            if (list == null) {
                this.ad_list = DEFAULT_AD_LIST;
                return;
            } else {
                this.ad_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.show_hint = builder.show_hint;
        this.show_ad = builder.show_ad;
        this.hint_url = builder.hint_url;
        this.ad_left_num = builder.ad_left_num;
        this.ad_list = Message.immutableCopyOf(builder.ad_list);
    }
}