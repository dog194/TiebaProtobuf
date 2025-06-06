package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class QuestionBonus extends Message {
    public static final String DEFAULT_CARD_TYPE = "";
    public static final String DEFAULT_GUIDE_URL = "";
    public static final String DEFAULT_INPUTBOX_TEXT = "";
    public static final String DEFAULT_PAID_OUT_TEXT = "";

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String card_type;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String guide_url;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String inputbox_text;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String paid_out_text;

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer status;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer tmoney;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer tmoney_plus;
    public static final Integer DEFAULT_TMONEY = 0;
    public static final Integer DEFAULT_TMONEY_PLUS = 0;
    public static final Integer DEFAULT_STATUS = 0;

    public static final class Builder extends Message.Builder<QuestionBonus> {
        public String card_type;
        public String guide_url;
        public String inputbox_text;
        public String paid_out_text;
        public Integer status;
        public Integer tmoney;
        public Integer tmoney_plus;

        public Builder() {
        }

        public Builder(QuestionBonus questionBonus) {
            super(questionBonus);
            if (questionBonus == null) {
                return;
            }
            this.tmoney = questionBonus.tmoney;
            this.tmoney_plus = questionBonus.tmoney_plus;
            this.status = questionBonus.status;
            this.guide_url = questionBonus.guide_url;
            this.paid_out_text = questionBonus.paid_out_text;
            this.inputbox_text = questionBonus.inputbox_text;
            this.card_type = questionBonus.card_type;
        }

        @Override // com.squareup.wire.Message.Builder
        public QuestionBonus build(boolean z) {
            return new QuestionBonus(this, z);
        }
    }

    public QuestionBonus(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.tmoney;
            if (num == null) {
                this.tmoney = DEFAULT_TMONEY;
            } else {
                this.tmoney = num;
            }
            Integer num2 = builder.tmoney_plus;
            if (num2 == null) {
                this.tmoney_plus = DEFAULT_TMONEY_PLUS;
            } else {
                this.tmoney_plus = num2;
            }
            Integer num3 = builder.status;
            if (num3 == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num3;
            }
            String str = builder.guide_url;
            if (str == null) {
                this.guide_url = "";
            } else {
                this.guide_url = str;
            }
            String str2 = builder.paid_out_text;
            if (str2 == null) {
                this.paid_out_text = "";
            } else {
                this.paid_out_text = str2;
            }
            String str3 = builder.inputbox_text;
            if (str3 == null) {
                this.inputbox_text = "";
            } else {
                this.inputbox_text = str3;
            }
            String str4 = builder.card_type;
            if (str4 == null) {
                this.card_type = "";
                return;
            } else {
                this.card_type = str4;
                return;
            }
        }
        this.tmoney = builder.tmoney;
        this.tmoney_plus = builder.tmoney_plus;
        this.status = builder.status;
        this.guide_url = builder.guide_url;
        this.paid_out_text = builder.paid_out_text;
        this.inputbox_text = builder.inputbox_text;
        this.card_type = builder.card_type;
    }
}