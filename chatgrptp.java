package com.distil.protection.android;

import android.accounts.AccountManager;
import android.content.Context;
import com.distil.protection.android.Protection;
import com.distil.protection.e.protection;
import com.distil.protection.functional.onContextItemSelected;
import com.distil.protection.functional.openContextMenu;
import com.distil.protection.functional.setContentView;
import com.distil.protection.functional.setFadingEdgeLength;
import com.distil.protection.functional.unregisterForContextMenu;
import com.distil.protection.j.onOptionsItemSelected;
import com.distil.protection.model.Receiver;
import e.b.a.b.b;
import e.b.a.b.c;
import e.b.a.b.d;
import e.b.a.b.g;
import e.b.a.b.h;
import e.b.a.b.j;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public final class Protection {
    private static int Receiver = 1;
    private static final com.distil.protection.model.values blockingGetToken = new com.distil.protection.model.values("2.Ae190wSTc4jIWOL9oX4X9xNGiNIwESaTLB_1HIbF9KWtcUE-bJziMsOZ1_9b2annlQEKxKgcwzyEKOLvI6V593pJleD8vSjF09Z_ney7tVN-RJFcoDvro_pnwuUXTE79gkWk8KQ2uK81KH7BuqOdgUzu0YqyD4wxMPr-FjRtOxzzYSg=");
    private static int getToken;
    private final onContextItemSelected<com.distil.protection.j.getToken, String> BuildConfig;
    private final com.distil.protection.functional.Receiver<com.distil.protection.model.Receiver<com.distil.protection.j.getToken>> Protection;
    private final com.distil.protection.android.b.BuildConfig<unregisterForContextMenu<com.distil.protection.j.getToken, com.distil.protection.model.ProtectionException>> protection;

    /* loaded from: classes.dex */
    public final class BuildConfig implements com.distil.protection.functional.Receiver<com.distil.protection.model.Receiver<unregisterForContextMenu<com.distil.protection.j.getToken, com.distil.protection.model.ProtectionException>>> {
        private static int BuildConfig = 0;
        private static int blockingGetToken = 1;
        private final com.distil.protection.functional.Receiver<com.distil.protection.model.NetworkFailureException> Protection;
        private final com.distil.protection.functional.Receiver<String> getToken;

        public BuildConfig(com.distil.protection.functional.Receiver<String> receiver, com.distil.protection.functional.Receiver<com.distil.protection.model.NetworkFailureException> receiver2) {
            Protection.this = r1;
            this.getToken = receiver;
            this.Protection = receiver2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.distil.protection.functional.Receiver
        public final /* synthetic */ void accept(com.distil.protection.model.Receiver<unregisterForContextMenu<com.distil.protection.j.getToken, com.distil.protection.model.ProtectionException>> receiver) {
            int i = blockingGetToken;
            int i2 = (((i | 61) << 1) - (~(-(((~i) & 61) | (i & (-62)))))) - 1;
            BuildConfig = i2 % 128;
            try {
                if ((i2 % 2 != 0 ? '!' : '_') != '_') {
                    this.getToken.accept(ProtectionException.BuildConfig(Protection.getToken(Protection.this, receiver)));
                    int i3 = 67 / 0;
                } else {
                    this.getToken.accept(ProtectionException.BuildConfig(Protection.getToken(Protection.this, receiver)));
                }
                int i4 = (((BuildConfig + 99) - 1) + 0) - 1;
                blockingGetToken = i4 % 128;
                int i5 = i4 % 2;
            } catch (com.distil.protection.model.NetworkFailureException e2) {
                this.Protection.accept(e2);
            } catch (com.distil.protection.model.valueOf e3) {
                this.getToken.accept(Protection.Protection(e3));
            }
        }
    }

    static {
        int i = getToken;
        int i2 = (i & 13) + (i | 13);
        Receiver = i2 % 128;
        if ((i2 % 2 == 0 ? 'Q' : '4') != '4') {
            int i3 = 53 / 0;
        }
    }

    private Protection(com.distil.protection.android.b.BuildConfig<unregisterForContextMenu<com.distil.protection.j.getToken, com.distil.protection.model.ProtectionException>> buildConfig, com.distil.protection.functional.Receiver<com.distil.protection.model.Receiver<com.distil.protection.j.getToken>> receiver) {
        this.protection = buildConfig;
        this.Protection = receiver;
        final Random random = new Random();
        this.BuildConfig = NetworkFailureException.Protection(new setContentView() { // from class: e.b.a.b.s
            @Override // com.distil.protection.functional.setContentView
            public final Object get() {
                return Integer.valueOf(random.nextInt());
            }
        });
    }

    private static Protection BuildConfig(Executor executor, final onContextItemSelected<com.distil.protection.functional.ProtectionException<com.distil.protection.j.getToken>, com.distil.protection.model.Receiver<unregisterForContextMenu<com.distil.protection.j.getToken, com.distil.protection.model.ProtectionException>>> oncontextitemselected, final com.distil.protection.functional.Receiver<com.distil.protection.j.getToken> receiver, final setContentView<com.distil.protection.functional.ProtectionException<com.distil.protection.j.getToken>> setcontentview, final setContentView<Long> setcontentview2, final com.distil.protection.functional.Receiver<String> receiver2, com.distil.protection.functional.ProtectionException<com.distil.protection.model.BuildConfig> protectionException) {
        final boolean Protection = protectionException.Protection();
        Protection protection = new Protection(new com.distil.protection.android.b.BuildConfig(new setContentView() { // from class: e.b.a.b.e
            @Override // com.distil.protection.functional.setContentView
            public final Object get() {
                Receiver token;
                token = Protection.getToken(onContextItemSelected.this, setcontentview, receiver, Protection, receiver2);
                return token;
            }
        }, executor, setcontentview2).Protection(), new com.distil.protection.functional.Receiver() { // from class: e.b.a.b.f
            @Override // com.distil.protection.functional.Receiver
            public final void accept(Object obj) {
                Protection.protection(Protection, receiver2, setcontentview2, (Receiver) obj);
            }
        });
        int i = Receiver;
        int i2 = ((i | 49) << 1) - (i ^ 49);
        getToken = i2 % 128;
        int i3 = i2 % 2;
        return protection;
    }

    public static /* synthetic */ String Protection(com.distil.protection.j.getToken gettoken) {
        int i = Receiver;
        int i2 = ((i | 17) << 1) - (i ^ 17);
        getToken = i2 % 128;
        int i3 = i2 % 2;
        String gettoken2 = com.distil.protection.j.setContentView.blockingGetToken(gettoken).toString();
        int i4 = Receiver;
        int i5 = i4 & 45;
        int i6 = -(-((i4 ^ 45) | i5));
        int i7 = (i5 & i6) + (i6 | i5);
        getToken = i7 % 128;
        if (i7 % 2 == 0) {
            return gettoken2;
        }
        throw null;
    }

    public static /* synthetic */ com.distil.protection.functional.ProtectionException blockingGetToken(String str) {
        try {
            com.distil.protection.functional.ProtectionException protection = com.distil.protection.functional.ProtectionException.protection(onOptionsItemSelected.Protection(new c.e.d.getToken(str)));
            int i = getToken;
            int i2 = i ^ 53;
            int i3 = -(-((i & 53) << 1));
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            Receiver = i4 % 128;
            int i5 = i4 % 2;
            return protection;
        } catch (c.e.d.Protection unused) {
            return com.distil.protection.functional.ProtectionException.protection();
        }
    }

    public static /* synthetic */ com.distil.protection.model.Receiver getToken(onContextItemSelected oncontextitemselected, setContentView setcontentview, com.distil.protection.functional.Receiver receiver, boolean z, com.distil.protection.functional.Receiver receiver2) {
        int i = getToken;
        int i2 = (i & (-124)) | ((~i) & 123);
        int i3 = (i & 123) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        Receiver = i4 % 128;
        int i5 = i4 % 2;
        com.distil.protection.model.Receiver receiver3 = (com.distil.protection.model.Receiver) oncontextitemselected.apply(setcontentview.get());
        ((unregisterForContextMenu) receiver3.get()).blockingGetToken(receiver);
        if (z) {
            StringBuilder sb = new StringBuilder("Distil SDK Client: Generated a new token with a lifetime of ");
            sb.append(receiver3.blockingGetToken / 1000);
            sb.append(" s.");
            receiver2.accept(sb.toString());
            int i6 = getToken;
            int i7 = (i6 & 17) + (i6 | 17);
            Receiver = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = getToken + 104;
        int i10 = ((i9 | (-1)) << 1) - (i9 ^ (-1));
        Receiver = i10 % 128;
        if ((i10 % 2 == 0 ? Typography.dollar : '1') == '1') {
            return receiver3;
        }
        throw null;
    }

    public static Protection protection(Context context, URL url) {
        int i = (getToken + 66) - 1;
        Receiver = i % 128;
        int i2 = i % 2;
        Protection protection = protection(context, url, com.distil.protection.g.Protection.getToken(), b.a, j.a, com.distil.protection.functional.ProtectionException.protection());
        int i3 = getToken;
        int i4 = ((i3 | 45) << 1) - (i3 ^ 45);
        Receiver = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        return protection;
    }

    public static /* synthetic */ c.e.d.getToken Protection(com.distil.protection.j.BuildConfig buildConfig) {
        c.e.d.getToken protection;
        int i = Receiver;
        int i2 = (i | 5) << 1;
        int i3 = -(i ^ 5);
        int i4 = (i2 & i3) + (i3 | i2);
        getToken = i4 % 128;
        if (i4 % 2 != 0) {
            protection = com.distil.protection.j.Receiver.protection(blockingGetToken, buildConfig);
            int i5 = 66 / 0;
        } else {
            protection = com.distil.protection.j.Receiver.protection(blockingGetToken, buildConfig);
        }
        int i6 = getToken;
        int i7 = (i6 & 59) + (i6 | 59);
        Receiver = i7 % 128;
        int i8 = i7 % 2;
        return protection;
    }

    public /* synthetic */ void Protection(com.distil.protection.model.Receiver receiver, com.distil.protection.j.getToken gettoken) {
        this.Protection.accept(new com.distil.protection.model.Receiver<>(gettoken, receiver.Protection, receiver.blockingGetToken));
        int i = (Receiver + 68) - 1;
        getToken = i % 128;
        int i2 = i % 2;
    }

    public final String blockingGetToken() {
        com.distil.protection.android.b.BuildConfig<unregisterForContextMenu<com.distil.protection.j.getToken, com.distil.protection.model.ProtectionException>> buildConfig = this.protection;
        com.distil.protection.android.b.Protection protection = new com.distil.protection.android.b.Protection();
        buildConfig.getToken(protection);
        com.distil.protection.model.Receiver receiver = (com.distil.protection.model.Receiver) protection.get();
        String str = (String) ProtectionException.BuildConfig(((unregisterForContextMenu) receiver.get()).blockingGetToken((com.distil.protection.functional.Receiver) new c(this, receiver)).BuildConfig(this.BuildConfig));
        int i = Receiver;
        int i2 = (((i & (-90)) | ((~i) & 89)) - (~((i & 89) << 1))) - 1;
        getToken = i2 % 128;
        if (!(i2 % 2 != 0)) {
            return str;
        }
        throw null;
    }

    public static Protection protection(Context context, URL url, String str) {
        openContextMenu<com.distil.protection.g.getToken, setFadingEdgeLength, IOException> token = com.distil.protection.g.Protection.getToken();
        b bVar = b.a;
        j jVar = j.a;
        Objects.requireNonNull(str);
        return protection(context, url, token, bVar, jVar, com.distil.protection.functional.ProtectionException.protection(new com.distil.protection.model.BuildConfig(str)));
    }

    public static /* synthetic */ String Protection(com.distil.protection.model.valueOf valueof) {
        StringWriter stringWriter = new StringWriter();
        valueof.printStackTrace(new PrintWriter(stringWriter));
        StringBuilder sb = new StringBuilder("debug:");
        sb.append(com.distil.protection.b.blockingGetToken.Protection(stringWriter.toString().getBytes(com.distil.protection.i.valueOf.Protection)));
        String obj = sb.toString();
        int i = getToken;
        int i2 = i & 67;
        int i3 = ((i ^ 67) | i2) << 1;
        int i4 = -((i | 67) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        Receiver = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final void getToken(com.distil.protection.functional.Receiver<String> receiver, com.distil.protection.functional.Receiver<com.distil.protection.model.NetworkFailureException> receiver2, Executor executor) {
        this.protection.getToken(protection.blockingGetToken(new BuildConfig(receiver, receiver2), executor));
        int i = Receiver;
        int i2 = (((i ^ 84) + ((i & 84) << 1)) + 0) - 1;
        getToken = i2 % 128;
        if ((i2 % 2 != 0 ? ',' : 'b') != 'b') {
            int i3 = 43 / 0;
        }
    }

    public static /* synthetic */ unregisterForContextMenu getToken(Protection protection, com.distil.protection.model.Receiver receiver) {
        int i = getToken;
        int i2 = (((i & (-86)) | ((~i) & 85)) - (~((i & 85) << 1))) - 1;
        Receiver = i2 % 128;
        int i3 = i2 % 2;
        unregisterForContextMenu BuildConfig2 = ((unregisterForContextMenu) receiver.get()).blockingGetToken((com.distil.protection.functional.Receiver) new c(protection, receiver)).BuildConfig(protection.BuildConfig);
        int i4 = getToken;
        int i5 = (i4 & 111) + (i4 | 111);
        Receiver = i5 % 128;
        if ((i5 % 2 == 0 ? 'E' : '=') != 'E') {
            return BuildConfig2;
        }
        throw null;
    }

    private static Protection protection(Context context, URL url, openContextMenu<com.distil.protection.g.getToken, setFadingEdgeLength, IOException> opencontextmenu, setContentView<Long> setcontentview, com.distil.protection.functional.Receiver<String> receiver, com.distil.protection.functional.ProtectionException<com.distil.protection.model.BuildConfig> protectionException) {
        URL blockingGetToken2 = com.distil.protection.g.getToken.blockingGetToken(url, com.serve.platform.BuildConfig.IMPERVA_SDK_CHALLENGE_PATH);
        Context applicationContext = context.getApplicationContext();
        com.distil.protection.f.blockingGetToken blockingGetToken3 = com.distil.protection.android.a.b.getToken.blockingGetToken(applicationContext.getSharedPreferences("rgoy6ft-Uas", 0), h.a, d.a, "8-t0UIvN0ic");
        com.distil.protection.m.protection BuildConfig2 = com.distil.protection.m.protection.BuildConfig();
        Protection BuildConfig3 = BuildConfig(Executors.newSingleThreadExecutor(), com.distil.protection.a.getToken.blockingGetToken(new getToken(context, Executors.newFixedThreadPool(3)), opencontextmenu, blockingGetToken2, com.distil.protection.d.getToken.blockingGetToken(), g.a, setcontentview, receiver, protectionException, values.getToken(applicationContext, applicationContext.getContentResolver(), applicationContext.getResources(), applicationContext.getPackageManager(), AccountManager.get(applicationContext), BuildConfig2), new com.distil.protection.d.protection(BuildConfig2), BuildConfig2), blockingGetToken3, blockingGetToken3, setcontentview, receiver, protectionException);
        int i = Receiver;
        int i2 = ((i | 107) << 1) - (i ^ 107);
        getToken = i2 % 128;
        int i3 = i2 % 2;
        return BuildConfig3;
    }

    public static /* synthetic */ void protection(boolean z, com.distil.protection.functional.Receiver receiver, setContentView setcontentview, com.distil.protection.model.Receiver receiver2) {
        int i = getToken;
        int i2 = i & 113;
        int i3 = (i ^ 113) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        Receiver = i4 % 128;
        int i5 = i4 % 2;
        if (z) {
            StringBuilder sb = new StringBuilder("Distil SDK Client: Token expires in ");
            sb.append(((receiver2.Protection - ((Long) setcontentview.get()).longValue()) + receiver2.blockingGetToken) / 1000);
            sb.append(" s.");
            receiver.accept(sb.toString());
            int i6 = getToken;
            int i7 = (((i6 ^ 71) | (i6 & 71)) << 1) - (((~i6) & 71) | (i6 & (-72)));
            Receiver = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = Receiver;
        int i10 = i9 & 45;
        int i11 = -(-(i9 | 45));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        getToken = i12 % 128;
        int i13 = i12 % 2;
    }
}
