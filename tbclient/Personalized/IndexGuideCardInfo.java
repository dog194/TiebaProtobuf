package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedKV;

/* loaded from: classes4.dex */
public final class IndexGuideCardInfo extends Message {
    public static final String DEFAULT_BG_URL = "";
    public static final String DEFAULT_BG_URL_DARK = "";
    public static final String DEFAULT_BUTTON_SCHEME = "";
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final List<FeedKV> DEFAULT_FREQ_INFO = Collections.emptyList();
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_SUB_TITLE = "";
    public static final String DEFAULT_TITLE = "";

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String bg_url;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String bg_url_dark;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String button_scheme;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String button_text;

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<FeedKV> freq_info;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon_url;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String sub_title;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    public static final class Builder extends Message.Builder<IndexGuideCardInfo> {
        public String bg_url;
        public String bg_url_dark;
        public String button_scheme;
        public String button_text;
        public List<FeedKV> freq_info;
        public String icon_url;
        public String sub_title;
        public String title;

        public Builder() {
        }

        public Builder(IndexGuideCardInfo indexGuideCardInfo) {
            super(indexGuideCardInfo);
            if (indexGuideCardInfo == null) {
                return;
            }
            this.icon_url = indexGuideCardInfo.icon_url;
            this.title = indexGuideCardInfo.title;
            this.sub_title = indexGuideCardInfo.sub_title;
            this.bg_url = indexGuideCardInfo.bg_url;
            this.button_scheme = indexGuideCardInfo.button_scheme;
            this.freq_info = Message.copyOf(indexGuideCardInfo.freq_info);
            this.button_text = indexGuideCardInfo.button_text;
            this.bg_url_dark = indexGuideCardInfo.bg_url_dark;
        }

        @Override // com.squareup.wire.Message.Builder
        public IndexGuideCardInfo build(boolean z) {
            return new IndexGuideCardInfo(this, z);
        }
    }

    public IndexGuideCardInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon_url;
            if (str == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.sub_title;
            if (str3 == null) {
                this.sub_title = "";
            } else {
                this.sub_title = str3;
            }
            String str4 = builder.bg_url;
            if (str4 == null) {
                this.bg_url = "";
            } else {
                this.bg_url = str4;
            }
            String str5 = builder.button_scheme;
            if (str5 == null) {
                this.button_scheme = "";
            } else {
                this.button_scheme = str5;
            }
            List<FeedKV> list = builder.freq_info;
            if (list == null) {
                this.freq_info = DEFAULT_FREQ_INFO;
            } else {
                this.freq_info = Message.immutableCopyOf(list);
            }
            String str6 = builder.button_text;
            if (str6 == null) {
                this.button_text = "";
            } else {
                this.button_text = str6;
            }
            String str7 = builder.bg_url_dark;
            if (str7 == null) {
                this.bg_url_dark = "";
                return;
            } else {
                this.bg_url_dark = str7;
                return;
            }
        }
        this.icon_url = builder.icon_url;
        this.title = builder.title;
        this.sub_title = builder.sub_title;
        this.bg_url = builder.bg_url;
        this.button_scheme = builder.button_scheme;
        this.freq_info = Message.immutableCopyOf(builder.freq_info);
        this.button_text = builder.button_text;
        this.bg_url_dark = builder.bg_url_dark;
    }
}