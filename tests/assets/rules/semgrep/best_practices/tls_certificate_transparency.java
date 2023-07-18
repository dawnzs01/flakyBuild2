     // Create a network interceptor
        // ruleid:android_certificate_transparency
        CTInterceptorBuilder builder = new CTInterceptorBuilder()
            .setFailOnError(isFailOnError)
            .setLogger(defaultLogger)
            .setDiskCache(new AndroidDiskCache(getApplication()));

        for (String host : hosts) {
            builder.includeHost(host);
        }

        Interceptor networkInterceptor = builder.build();

        // Set the interceptor when creating the OkHttp client
        return new OkHttpClient.Builder()
            .addNetworkInterceptor(networkInterceptor)
            .build();


 HttpsURLConnection httpsConnection = (HttpsURLConnection) connection;

            // Create a hostname verifier wrapping the original
            // ruleid:android_certificate_transparency
            CTHostnameVerifierBuilder builder = new CTHostnameVerifierBuilder(httpsConnection.getHostnameVerifier())
                .setFailOnError(isFailOnError)
                .setLogger(defaultLogger)
                .setDiskCache(new AndroidDiskCache(getApplication()));

            for (String host : hosts) {
                builder.includeHost(host);
            }

            httpsConnection.setHostnameVerifier(builder.build());
   // Create a hostname verifier wrapping the original
            // ruleid:android_certificate_transparency
            CTHostnameVerifierBuilder builder = new CTHostnameVerifierBuilder(httpsConnection.getHostnameVerifier())
                .setFailOnError(isFailOnError)
                .setLogger(defaultLogger)
                .setDiskCache(new AndroidDiskCache(getApplication()));

            for (String host : hosts) {
                builder.includeHost(host);
            }

            httpsConnection.setHostnameVerifier(builder.build());