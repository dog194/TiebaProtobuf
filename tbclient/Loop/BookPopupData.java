package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BookPopupExt;

/* loaded from: classes4.dex */
public final class BookPopupData extends Message {
    public static final String DEFAULT_BTN_TEXT = "";
    public static final String DEFAULT_BTN_TEXT_WIFI = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_DESC_WIFI = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_TITLE = "";

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String btn_text;

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String btn_text_wifi;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String desc;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String desc_wifi;

    @ProtoField(tag = 8)
    public final BookPopupExt ext;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer frequency;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer jump_type;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String jump_url;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer source;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    public static final Integer DEFAULT_JUMP_TYPE = 0;
    public static final Integer DEFAULT_FREQUENCY = 0;
    public static final Integer DEFAULT_SOURCE = 0;

    public static final class Builder extends Message.Builder<BookPopupData> {
        public String btn_text;
        public String btn_text_wifi;
        public String desc;
        public String desc_wifi;
        public BookPopupExt ext;
        public Integer frequency;
        public Integer jump_type;
        public String jump_url;
        public Integer source;
        public String title;

        public Builder() {
        }

        public Builder(BookPopupData bookPopupData) {
            super(bookPopupData);
            if (bookPopupData == null) {
                return;
            }
            this.title = bookPopupData.title;
            this.desc = bookPopupData.desc;
            this.btn_text = bookPopupData.btn_text;
            this.jump_type = bookPopupData.jump_type;
            this.jump_url = bookPopupData.jump_url;
            this.frequency = bookPopupData.frequency;
            this.source = bookPopupData.source;
            this.ext = bookPopupData.ext;
            this.desc_wifi = bookPopupData.desc_wifi;
            this.btn_text_wifi = bookPopupData.btn_text_wifi;
        }

        @Override // com.squareup.wire.Message.Builder
        public BookPopupData build(boolean z) {
            return new BookPopupData(this, z);
        }
    }

    public BookPopupData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.desc;
            if (str2 == null) {
                this.desc = "";
            } else {
                this.desc = str2;
            }
            String str3 = builder.btn_text;
            if (str3 == null) {
                this.btn_text = "";
            } else {
                this.btn_text = str3;
            }
            Integer num = builder.jump_type;
            if (num == null) {
                this.jump_type = DEFAULT_JUMP_TYPE;
            } else {
                this.jump_type = num;
            }
            String str4 = builder.jump_url;
            if (str4 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str4;
            }
            Integer num2 = builder.frequency;
            if (num2 == null) {
                this.frequency = DEFAULT_FREQUENCY;
            } else {
                this.frequency = num2;
            }
            Integer num3 = builder.source;
            if (num3 == null) {
                this.source = DEFAULT_SOURCE;
            } else {
                this.source = num3;
            }
            this.ext = builder.ext;
            String str5 = builder.desc_wifi;
            if (str5 == null) {
                this.desc_wifi = "";
            } else {
                this.desc_wifi = str5;
            }
            String str6 = builder.btn_text_wifi;
            if (str6 == null) {
                this.btn_text_wifi = "";
                return;
            } else {
                this.btn_text_wifi = str6;
                return;
            }
        }
        this.title = builder.title;
        this.desc = builder.desc;
        this.btn_text = builder.btn_text;
        this.jump_type = builder.jump_type;
        this.jump_url = builder.jump_url;
        this.frequency = builder.frequency;
        this.source = builder.source;
        this.ext = builder.ext;
        this.desc_wifi = builder.desc_wifi;
        this.btn_text_wifi = builder.btn_text_wifi;
    }
}