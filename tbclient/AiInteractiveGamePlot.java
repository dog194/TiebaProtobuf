package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AiInteractiveGamePlot extends Message {
    public static final String DEFAULT_BOT_BACKGROUND_URL = "";
    public static final String DEFAULT_BOT_UK = "";
    public static final String DEFAULT_PLOT_DESCRIPTION = "";
    public static final String DEFAULT_PLOT_TITLE = "";
    public static final String DEFAULT_PORTRAIT_URL = "";

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String bot_background_url;

    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long bot_pa;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bot_uk;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String plot_description;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long plot_id;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String plot_title;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String portrait_url;

    @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
    public final Double rate;
    public static final Long DEFAULT_PLOT_ID = 0L;
    public static final Long DEFAULT_BOT_PA = 0L;
    public static final Double DEFAULT_RATE = Double.valueOf(0.0d);

    public static final class Builder extends Message.Builder<AiInteractiveGamePlot> {
        public String bot_background_url;
        public Long bot_pa;
        public String bot_uk;
        public String plot_description;
        public Long plot_id;
        public String plot_title;
        public String portrait_url;
        public Double rate;

        public Builder() {
        }

        public Builder(AiInteractiveGamePlot aiInteractiveGamePlot) {
            super(aiInteractiveGamePlot);
            if (aiInteractiveGamePlot == null) {
                return;
            }
            this.plot_id = aiInteractiveGamePlot.plot_id;
            this.bot_uk = aiInteractiveGamePlot.bot_uk;
            this.bot_pa = aiInteractiveGamePlot.bot_pa;
            this.portrait_url = aiInteractiveGamePlot.portrait_url;
            this.plot_title = aiInteractiveGamePlot.plot_title;
            this.plot_description = aiInteractiveGamePlot.plot_description;
            this.bot_background_url = aiInteractiveGamePlot.bot_background_url;
            this.rate = aiInteractiveGamePlot.rate;
        }

        @Override // com.squareup.wire.Message.Builder
        public AiInteractiveGamePlot build(boolean z) {
            return new AiInteractiveGamePlot(this, z);
        }
    }

    public AiInteractiveGamePlot(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.plot_id;
            if (l == null) {
                this.plot_id = DEFAULT_PLOT_ID;
            } else {
                this.plot_id = l;
            }
            String str = builder.bot_uk;
            if (str == null) {
                this.bot_uk = "";
            } else {
                this.bot_uk = str;
            }
            Long l2 = builder.bot_pa;
            if (l2 == null) {
                this.bot_pa = DEFAULT_BOT_PA;
            } else {
                this.bot_pa = l2;
            }
            String str2 = builder.portrait_url;
            if (str2 == null) {
                this.portrait_url = "";
            } else {
                this.portrait_url = str2;
            }
            String str3 = builder.plot_title;
            if (str3 == null) {
                this.plot_title = "";
            } else {
                this.plot_title = str3;
            }
            String str4 = builder.plot_description;
            if (str4 == null) {
                this.plot_description = "";
            } else {
                this.plot_description = str4;
            }
            String str5 = builder.bot_background_url;
            if (str5 == null) {
                this.bot_background_url = "";
            } else {
                this.bot_background_url = str5;
            }
            Double d = builder.rate;
            if (d == null) {
                this.rate = DEFAULT_RATE;
                return;
            } else {
                this.rate = d;
                return;
            }
        }
        this.plot_id = builder.plot_id;
        this.bot_uk = builder.bot_uk;
        this.bot_pa = builder.bot_pa;
        this.portrait_url = builder.portrait_url;
        this.plot_title = builder.plot_title;
        this.plot_description = builder.plot_description;
        this.bot_background_url = builder.bot_background_url;
        this.rate = builder.rate;
    }
}