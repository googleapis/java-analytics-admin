# Changelog

## [0.7.0](https://github.com/googleapis/java-analytics-admin/compare/java-analytics-admin-v0.6.2...java-analytics-admin-v0.7.0) (2022-01-04)


### ⚠ BREAKING CHANGES

* release gapic-generator-java v2.0.0 (#257)
* remove `CreateIosAppDataStream`, `CreateAndroidAppDataStream` methods from the API (#203)
* `update_mask` field is required for all Update operations
* rename `country_code` field to `region_code` in `Account`
* rename `url_query_parameter` field to `uri_query_parameter` in `EnhancedMeasurementSettings`
* remove `parent` field from `GoogleAdsLink`
* remove unused fields from `EnhancedMeasurementSettings` (#137)

### Features

* add `GetDataRetentionSettings`, `UpdateDataRetentionSettings` methods to the API ([#269](https://github.com/googleapis/java-analytics-admin/issues/269)) ([3d3726d](https://github.com/googleapis/java-analytics-admin/commit/3d3726db76a6763b3c7a2dd7132b0fefbfe7c6ac))
* add CreateCustomDimension, GetCustomDimension, UpdateCustomDimension, ListCustomDimensions, ArchiveCustomDimension methods to the API ([#221](https://github.com/googleapis/java-analytics-admin/issues/221)) ([16ff4a6](https://github.com/googleapis/java-analytics-admin/commit/16ff4a6f4291e1668b710807722cbd3901d51f02))
* add custom output only field to ConversionEvent type ([3de05e5](https://github.com/googleapis/java-analytics-admin/commit/3de05e56d905d74ae7468aed7e66e24c685c5df6))
* add display_video_360_advertiser_link, display_video_360_advertiser_link_proposal, data_retention_settings fields to ChangeHistoryChange.resource oneof field. ([3de05e5](https://github.com/googleapis/java-analytics-admin/commit/3de05e56d905d74ae7468aed7e66e24c685c5df6))
* add pagination support for `ListFirebaseLinks` operation ([6bfa58c](https://github.com/googleapis/java-analytics-admin/commit/6bfa58c307adc8a79dd05345299f8e39ddcf32db))
* add service_level field to Property type ([3de05e5](https://github.com/googleapis/java-analytics-admin/commit/3de05e56d905d74ae7468aed7e66e24c685c5df6))
* added ListAccountSummaries method ([#74](https://github.com/googleapis/java-analytics-admin/issues/74)) ([128bb78](https://github.com/googleapis/java-analytics-admin/commit/128bb7882cf36b5ce05b81fbf63c7cc306d9b655))
* change measurement_unit field to mutable in CustomMetric type ([3de05e5](https://github.com/googleapis/java-analytics-admin/commit/3de05e56d905d74ae7468aed7e66e24c685c5df6))
* initial generation ([83cb5b3](https://github.com/googleapis/java-analytics-admin/commit/83cb5b335c3f2d4ad15eeb3d3bef56b6384ab041))
* release gapic-generator-java v2.0.0 ([#257](https://github.com/googleapis/java-analytics-admin/issues/257)) ([ebbc014](https://github.com/googleapis/java-analytics-admin/commit/ebbc014dfde8577e1331bc09ecc2abae3e5b2f82))
* Remove use of deprecated gradle command in java README ([#1196](https://github.com/googleapis/java-analytics-admin/issues/1196)) ([#273](https://github.com/googleapis/java-analytics-admin/issues/273)) ([dd7bfaa](https://github.com/googleapis/java-analytics-admin/commit/dd7bfaa111cf32a7e3f415ec43fcd53c7010769e))


### Bug Fixes

* 'requests' field of CreateUserLink, UpdateUserLink, DeleteUserLink methods is now required ([#96](https://github.com/googleapis/java-analytics-admin/issues/96)) ([c15a776](https://github.com/googleapis/java-analytics-admin/commit/c15a776d47eb4d28865453281ea7c36b2510892a))
* `update_mask` field is required for all Update operations ([6bfa58c](https://github.com/googleapis/java-analytics-admin/commit/6bfa58c307adc8a79dd05345299f8e39ddcf32db))
* add `https://www.googleapis.com/auth/analytics.edit` OAuth2 scope to the list of acceptable scopes for all read only methods ([#179](https://github.com/googleapis/java-analytics-admin/issues/179)) ([e8d6269](https://github.com/googleapis/java-analytics-admin/commit/e8d626908a020d4c1ea6ff0ff34afd5d65ae967a))
* Add `shopt -s nullglob` to dependencies script ([#1130](https://github.com/googleapis/java-analytics-admin/issues/1130)) ([#232](https://github.com/googleapis/java-analytics-admin/issues/232)) ([7dffdfc](https://github.com/googleapis/java-analytics-admin/commit/7dffdfcfa03bd9df5d3a0678a816bdc5339dcb11))
* don't log downloads ([#168](https://github.com/googleapis/java-analytics-admin/issues/168)) ([a781d7d](https://github.com/googleapis/java-analytics-admin/commit/a781d7d77c3314456b9bdc7982f1ef89c7acd0e5))
* **java:** add -ntp flag to native image testing command ([#1299](https://github.com/googleapis/java-analytics-admin/issues/1299)) ([#322](https://github.com/googleapis/java-analytics-admin/issues/322)) ([259886e](https://github.com/googleapis/java-analytics-admin/commit/259886e2a1b1ed49adf0ba37f220e6b4059d4737))
* **java:** java 17 dependency arguments ([#1266](https://github.com/googleapis/java-analytics-admin/issues/1266)) ([#307](https://github.com/googleapis/java-analytics-admin/issues/307)) ([4cfbf3b](https://github.com/googleapis/java-analytics-admin/commit/4cfbf3b3e0bc93292fdf6e80aa662356399db047))
* **java:** run Maven in plain console-friendly mode ([#1301](https://github.com/googleapis/java-analytics-admin/issues/1301)) ([#326](https://github.com/googleapis/java-analytics-admin/issues/326)) ([e456449](https://github.com/googleapis/java-analytics-admin/commit/e4564497b94927eb550712364467cefa545ae1fe))
* release scripts from issuing overlapping phases ([#197](https://github.com/googleapis/java-analytics-admin/issues/197)) ([30b1195](https://github.com/googleapis/java-analytics-admin/commit/30b1195db5389a7fb940b4decf13baf68fcd1005))
* remove `CreateIosAppDataStream`, `CreateAndroidAppDataStream` methods from the API ([#203](https://github.com/googleapis/java-analytics-admin/issues/203)) ([ca467ec](https://github.com/googleapis/java-analytics-admin/commit/ca467ec5bbcaf3dccf4c791426ec612c903392e2))
* remove `parent` field from `GoogleAdsLink` ([6bfa58c](https://github.com/googleapis/java-analytics-admin/commit/6bfa58c307adc8a79dd05345299f8e39ddcf32db))
* remove maximum_user_access field from FirebaseLink type ([3de05e5](https://github.com/googleapis/java-analytics-admin/commit/3de05e56d905d74ae7468aed7e66e24c685c5df6))
* remove MaximumUserAccess enum from the API ([3de05e5](https://github.com/googleapis/java-analytics-admin/commit/3de05e56d905d74ae7468aed7e66e24c685c5df6))
* remove unused fields from `EnhancedMeasurementSettings` ([#137](https://github.com/googleapis/java-analytics-admin/issues/137)) ([6bfa58c](https://github.com/googleapis/java-analytics-admin/commit/6bfa58c307adc8a79dd05345299f8e39ddcf32db))
* remove UpdateFirebaseLink method from the API ([3de05e5](https://github.com/googleapis/java-analytics-admin/commit/3de05e56d905d74ae7468aed7e66e24c685c5df6))
* rename `country_code` field to `region_code` in `Account` ([6bfa58c](https://github.com/googleapis/java-analytics-admin/commit/6bfa58c307adc8a79dd05345299f8e39ddcf32db))
* rename `url_query_parameter` field to `uri_query_parameter` in `EnhancedMeasurementSettings` ([6bfa58c](https://github.com/googleapis/java-analytics-admin/commit/6bfa58c307adc8a79dd05345299f8e39ddcf32db))
* rename email_address field of GoogleAdsLink type to creator_email_address ([3de05e5](https://github.com/googleapis/java-analytics-admin/commit/3de05e56d905d74ae7468aed7e66e24c685c5df6))
* rename is_deletable field of ConversionEvent type to deletable ([3de05e5](https://github.com/googleapis/java-analytics-admin/commit/3de05e56d905d74ae7468aed7e66e24c685c5df6))
* typo ([#196](https://github.com/googleapis/java-analytics-admin/issues/196)) ([3001dfc](https://github.com/googleapis/java-analytics-admin/commit/3001dfc339cfa7f23497481f95e0314bdf8d7189))


### Documentation

* generate sample code in the Java microgenerator ([#152](https://github.com/googleapis/java-analytics-admin/issues/152)) ([62b6cd9](https://github.com/googleapis/java-analytics-admin/commit/62b6cd925df28035c247d67fbe86c5e46d810d4d))
* minor documentation updates ([c15a776](https://github.com/googleapis/java-analytics-admin/commit/c15a776d47eb4d28865453281ea7c36b2510892a))
* put markdown table in a codeblock ([#132](https://github.com/googleapis/java-analytics-admin/issues/132)) ([15ccf20](https://github.com/googleapis/java-analytics-admin/commit/15ccf20bf20791d2a0192d67302e40a46a5cf432))
* renamed App + Web to Google Analytics 4 (GA4) in public documentation ([#86](https://github.com/googleapis/java-analytics-admin/issues/86)) ([22e27ca](https://github.com/googleapis/java-analytics-admin/commit/22e27ca307e0b900c1eb89d9872685950ee9e44e))
* update the documentation of the `update_mask` field used by Update() methods ([e8d6269](https://github.com/googleapis/java-analytics-admin/commit/e8d626908a020d4c1ea6ff0ff34afd5d65ae967a))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.10.0 ([#53](https://github.com/googleapis/java-analytics-admin/issues/53)) ([8268d33](https://github.com/googleapis/java-analytics-admin/commit/8268d33dd99ee0a220053a9dc2f0a4bea77f8f28))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.10.2 ([#63](https://github.com/googleapis/java-analytics-admin/issues/63)) ([ddc8c2f](https://github.com/googleapis/java-analytics-admin/commit/ddc8c2f01efa54fce560c35a235c7d1a3a057c44))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.12.1 ([#81](https://github.com/googleapis/java-analytics-admin/issues/81)) ([58cb9b3](https://github.com/googleapis/java-analytics-admin/commit/58cb9b3a3bb64904fafae8ea414ddf729b6b6983))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.13.0 ([#84](https://github.com/googleapis/java-analytics-admin/issues/84)) ([5db8220](https://github.com/googleapis/java-analytics-admin/commit/5db82207c3e1e056714dc2dbaf3cd62ae3d849c9))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.14.1 ([#91](https://github.com/googleapis/java-analytics-admin/issues/91)) ([ac21804](https://github.com/googleapis/java-analytics-admin/commit/ac21804451ac2fe557f4cec7b19a7cdb290475e1))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.15.0 ([#102](https://github.com/googleapis/java-analytics-admin/issues/102)) ([49b319e](https://github.com/googleapis/java-analytics-admin/commit/49b319e61f06abcead5e67a2b67c5476d72cab57))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.16.0 ([#112](https://github.com/googleapis/java-analytics-admin/issues/112)) ([166c0d0](https://github.com/googleapis/java-analytics-admin/commit/166c0d0a9c4b03a6471417f15c806a2008cc276a))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.16.1 ([#122](https://github.com/googleapis/java-analytics-admin/issues/122)) ([2a6832b](https://github.com/googleapis/java-analytics-admin/commit/2a6832badbd82e8ab5e8c17dac0a0de23470074d))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.17.0 ([#126](https://github.com/googleapis/java-analytics-admin/issues/126)) ([5b374ef](https://github.com/googleapis/java-analytics-admin/commit/5b374efd30dd85b5142c581037150f796908aecb))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.18.0 ([#136](https://github.com/googleapis/java-analytics-admin/issues/136)) ([6d52546](https://github.com/googleapis/java-analytics-admin/commit/6d52546b2fc5703571801d5b8045574ad9985bf1))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.19.0 ([#169](https://github.com/googleapis/java-analytics-admin/issues/169)) ([52b071b](https://github.com/googleapis/java-analytics-admin/commit/52b071b0f15d347510d722daacd071838c930249))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.20.0 ([#175](https://github.com/googleapis/java-analytics-admin/issues/175)) ([75db870](https://github.com/googleapis/java-analytics-admin/commit/75db8701c1bb6b130e7f4399f71d13d84088c5f2))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.20.1 ([#186](https://github.com/googleapis/java-analytics-admin/issues/186)) ([1a2d614](https://github.com/googleapis/java-analytics-admin/commit/1a2d614c80c0c5849f7aa71f3cae20165c3ed4aa))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.21.0 ([#194](https://github.com/googleapis/java-analytics-admin/issues/194)) ([b429a0b](https://github.com/googleapis/java-analytics-admin/commit/b429a0ba4fea5f974e24f3d8e06a03addcbedc0e))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.21.1 ([#198](https://github.com/googleapis/java-analytics-admin/issues/198)) ([640a1c2](https://github.com/googleapis/java-analytics-admin/commit/640a1c2398dd49d8acaa3826ff857baf715ffd43))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.8.3 ([#8](https://github.com/googleapis/java-analytics-admin/issues/8)) ([42523c3](https://github.com/googleapis/java-analytics-admin/commit/42523c34e17451a00ad38c441f7eff2513eea077))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.8.6 ([6461e4c](https://github.com/googleapis/java-analytics-admin/commit/6461e4c7935c15a3e553263fa44c689769370369))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.9.0 ([#34](https://github.com/googleapis/java-analytics-admin/issues/34)) ([52df7a7](https://github.com/googleapis/java-analytics-admin/commit/52df7a73bb0244e557f714c713d9eb7a700c6a4f))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1 ([#201](https://github.com/googleapis/java-analytics-admin/issues/201)) ([c148921](https://github.com/googleapis/java-analytics-admin/commit/c1489212a633e8ec6e9fa8838c3f3549ab14b4a4))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.1.0 ([#210](https://github.com/googleapis/java-analytics-admin/issues/210)) ([4801dd7](https://github.com/googleapis/java-analytics-admin/commit/4801dd7212132eb184f2d851549ab99e671150dd))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.2.0 ([#214](https://github.com/googleapis/java-analytics-admin/issues/214)) ([c8b4d76](https://github.com/googleapis/java-analytics-admin/commit/c8b4d76f3d3eff834637a135c7ccff7863073b33))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.3.0 ([#222](https://github.com/googleapis/java-analytics-admin/issues/222)) ([8bc7f9e](https://github.com/googleapis/java-analytics-admin/commit/8bc7f9eb4178a0f4a33b2180123d24b635f3f466))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.4.0 ([#234](https://github.com/googleapis/java-analytics-admin/issues/234)) ([fdd111a](https://github.com/googleapis/java-analytics-admin/commit/fdd111a9791d2f2f0b32d3a439023a34fd67656a))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2 ([#258](https://github.com/googleapis/java-analytics-admin/issues/258)) ([315f245](https://github.com/googleapis/java-analytics-admin/commit/315f245df1b516966b19a6a0980c3967cd4aca51))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.0.1 ([#264](https://github.com/googleapis/java-analytics-admin/issues/264)) ([a1c4442](https://github.com/googleapis/java-analytics-admin/commit/a1c444255cf6d0e14f81b679f7f41e4c8c5bbfa3))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.1.0 ([#268](https://github.com/googleapis/java-analytics-admin/issues/268)) ([1ef6fd5](https://github.com/googleapis/java-analytics-admin/commit/1ef6fd5631f6380ea10dbeb56959b93088fd7bab))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.2.0 ([#275](https://github.com/googleapis/java-analytics-admin/issues/275)) ([98c2fc5](https://github.com/googleapis/java-analytics-admin/commit/98c2fc502d1640021c84e3c739c74b0f48fbed9b))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.2.1 ([#283](https://github.com/googleapis/java-analytics-admin/issues/283)) ([498c5bf](https://github.com/googleapis/java-analytics-admin/commit/498c5bf2459a813d12f796362e113e782aa78114))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.3.0 ([#290](https://github.com/googleapis/java-analytics-admin/issues/290)) ([44ca8f6](https://github.com/googleapis/java-analytics-admin/commit/44ca8f6ef27550bc9b9a02a01463912e12d6f614))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.4.0 ([#301](https://github.com/googleapis/java-analytics-admin/issues/301)) ([f974058](https://github.com/googleapis/java-analytics-admin/commit/f974058cac256ea2e217758b2791b26487f8b054))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.5.0 ([#316](https://github.com/googleapis/java-analytics-admin/issues/316)) ([90be858](https://github.com/googleapis/java-analytics-admin/commit/90be858cd029c33b9c46962c12a89199c15c85c3))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.5.1 ([#321](https://github.com/googleapis/java-analytics-admin/issues/321)) ([6d31a66](https://github.com/googleapis/java-analytics-admin/commit/6d31a66c32ed7d16d10e0205f05790be76c92fe0))

### [0.6.2](https://www.github.com/googleapis/java-analytics-admin/compare/v0.6.1...v0.6.2) (2021-10-19)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.4.0 ([#301](https://www.github.com/googleapis/java-analytics-admin/issues/301)) ([f974058](https://www.github.com/googleapis/java-analytics-admin/commit/f974058cac256ea2e217758b2791b26487f8b054))

### [0.6.1](https://www.github.com/googleapis/java-analytics-admin/compare/v0.6.0...v0.6.1) (2021-09-24)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.3.0 ([#290](https://www.github.com/googleapis/java-analytics-admin/issues/290)) ([44ca8f6](https://www.github.com/googleapis/java-analytics-admin/commit/44ca8f6ef27550bc9b9a02a01463912e12d6f614))

## [0.6.0](https://www.github.com/googleapis/java-analytics-admin/compare/v0.5.0...v0.6.0) (2021-09-15)


### Features

* Remove use of deprecated gradle command in java README ([#1196](https://www.github.com/googleapis/java-analytics-admin/issues/1196)) ([#273](https://www.github.com/googleapis/java-analytics-admin/issues/273)) ([dd7bfaa](https://www.github.com/googleapis/java-analytics-admin/commit/dd7bfaa111cf32a7e3f415ec43fcd53c7010769e))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.0.1 ([#264](https://www.github.com/googleapis/java-analytics-admin/issues/264)) ([a1c4442](https://www.github.com/googleapis/java-analytics-admin/commit/a1c444255cf6d0e14f81b679f7f41e4c8c5bbfa3))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.1.0 ([#268](https://www.github.com/googleapis/java-analytics-admin/issues/268)) ([1ef6fd5](https://www.github.com/googleapis/java-analytics-admin/commit/1ef6fd5631f6380ea10dbeb56959b93088fd7bab))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.2.0 ([#275](https://www.github.com/googleapis/java-analytics-admin/issues/275)) ([98c2fc5](https://www.github.com/googleapis/java-analytics-admin/commit/98c2fc502d1640021c84e3c739c74b0f48fbed9b))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.2.1 ([#283](https://www.github.com/googleapis/java-analytics-admin/issues/283)) ([498c5bf](https://www.github.com/googleapis/java-analytics-admin/commit/498c5bf2459a813d12f796362e113e782aa78114))

## [0.5.0](https://www.github.com/googleapis/java-analytics-admin/compare/v0.4.0...v0.5.0) (2021-08-06)


### ⚠ BREAKING CHANGES

* release gapic-generator-java v2.0.0 (#257)

### Features

* release gapic-generator-java v2.0.0 ([#257](https://www.github.com/googleapis/java-analytics-admin/issues/257)) ([ebbc014](https://www.github.com/googleapis/java-analytics-admin/commit/ebbc014dfde8577e1331bc09ecc2abae3e5b2f82))


### Bug Fixes

* Add `shopt -s nullglob` to dependencies script ([#1130](https://www.github.com/googleapis/java-analytics-admin/issues/1130)) ([#232](https://www.github.com/googleapis/java-analytics-admin/issues/232)) ([7dffdfc](https://www.github.com/googleapis/java-analytics-admin/commit/7dffdfcfa03bd9df5d3a0678a816bdc5339dcb11))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.4.0 ([#234](https://www.github.com/googleapis/java-analytics-admin/issues/234)) ([fdd111a](https://www.github.com/googleapis/java-analytics-admin/commit/fdd111a9791d2f2f0b32d3a439023a34fd67656a))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2 ([#258](https://www.github.com/googleapis/java-analytics-admin/issues/258)) ([315f245](https://www.github.com/googleapis/java-analytics-admin/commit/315f245df1b516966b19a6a0980c3967cd4aca51))

## [0.4.0](https://www.github.com/googleapis/java-analytics-admin/compare/v0.3.2...v0.4.0) (2021-06-15)


### ⚠ BREAKING CHANGES

* remove `CreateIosAppDataStream`, `CreateAndroidAppDataStream` methods from the API (#203)

### Features

* add CreateCustomDimension, GetCustomDimension, UpdateCustomDimension, ListCustomDimensions, ArchiveCustomDimension methods to the API ([#221](https://www.github.com/googleapis/java-analytics-admin/issues/221)) ([16ff4a6](https://www.github.com/googleapis/java-analytics-admin/commit/16ff4a6f4291e1668b710807722cbd3901d51f02))


### Bug Fixes

* add `https://www.googleapis.com/auth/analytics.edit` OAuth2 scope to the list of acceptable scopes for all read only methods ([#179](https://www.github.com/googleapis/java-analytics-admin/issues/179)) ([e8d6269](https://www.github.com/googleapis/java-analytics-admin/commit/e8d626908a020d4c1ea6ff0ff34afd5d65ae967a))
* release scripts from issuing overlapping phases ([#197](https://www.github.com/googleapis/java-analytics-admin/issues/197)) ([30b1195](https://www.github.com/googleapis/java-analytics-admin/commit/30b1195db5389a7fb940b4decf13baf68fcd1005))
* remove `CreateIosAppDataStream`, `CreateAndroidAppDataStream` methods from the API ([#203](https://www.github.com/googleapis/java-analytics-admin/issues/203)) ([ca467ec](https://www.github.com/googleapis/java-analytics-admin/commit/ca467ec5bbcaf3dccf4c791426ec612c903392e2))
* typo ([#196](https://www.github.com/googleapis/java-analytics-admin/issues/196)) ([3001dfc](https://www.github.com/googleapis/java-analytics-admin/commit/3001dfc339cfa7f23497481f95e0314bdf8d7189))


### Documentation

* update the documentation of the `update_mask` field used by Update() methods ([e8d6269](https://www.github.com/googleapis/java-analytics-admin/commit/e8d626908a020d4c1ea6ff0ff34afd5d65ae967a))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.20.1 ([#186](https://www.github.com/googleapis/java-analytics-admin/issues/186)) ([1a2d614](https://www.github.com/googleapis/java-analytics-admin/commit/1a2d614c80c0c5849f7aa71f3cae20165c3ed4aa))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.21.0 ([#194](https://www.github.com/googleapis/java-analytics-admin/issues/194)) ([b429a0b](https://www.github.com/googleapis/java-analytics-admin/commit/b429a0ba4fea5f974e24f3d8e06a03addcbedc0e))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.21.1 ([#198](https://www.github.com/googleapis/java-analytics-admin/issues/198)) ([640a1c2](https://www.github.com/googleapis/java-analytics-admin/commit/640a1c2398dd49d8acaa3826ff857baf715ffd43))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1 ([#201](https://www.github.com/googleapis/java-analytics-admin/issues/201)) ([c148921](https://www.github.com/googleapis/java-analytics-admin/commit/c1489212a633e8ec6e9fa8838c3f3549ab14b4a4))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.1.0 ([#210](https://www.github.com/googleapis/java-analytics-admin/issues/210)) ([4801dd7](https://www.github.com/googleapis/java-analytics-admin/commit/4801dd7212132eb184f2d851549ab99e671150dd))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.2.0 ([#214](https://www.github.com/googleapis/java-analytics-admin/issues/214)) ([c8b4d76](https://www.github.com/googleapis/java-analytics-admin/commit/c8b4d76f3d3eff834637a135c7ccff7863073b33))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.3.0 ([#222](https://www.github.com/googleapis/java-analytics-admin/issues/222)) ([8bc7f9e](https://www.github.com/googleapis/java-analytics-admin/commit/8bc7f9eb4178a0f4a33b2180123d24b635f3f466))

### [0.3.2](https://www.github.com/googleapis/java-analytics-admin/compare/v0.3.1...v0.3.2) (2021-02-25)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.20.0 ([#175](https://www.github.com/googleapis/java-analytics-admin/issues/175)) ([75db870](https://www.github.com/googleapis/java-analytics-admin/commit/75db8701c1bb6b130e7f4399f71d13d84088c5f2))

### [0.3.1](https://www.github.com/googleapis/java-analytics-admin/compare/v0.3.0...v0.3.1) (2021-02-22)


### Bug Fixes

* don't log downloads ([#168](https://www.github.com/googleapis/java-analytics-admin/issues/168)) ([a781d7d](https://www.github.com/googleapis/java-analytics-admin/commit/a781d7d77c3314456b9bdc7982f1ef89c7acd0e5))


### Documentation

* generate sample code in the Java microgenerator ([#152](https://www.github.com/googleapis/java-analytics-admin/issues/152)) ([62b6cd9](https://www.github.com/googleapis/java-analytics-admin/commit/62b6cd925df28035c247d67fbe86c5e46d810d4d))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.19.0 ([#169](https://www.github.com/googleapis/java-analytics-admin/issues/169)) ([52b071b](https://www.github.com/googleapis/java-analytics-admin/commit/52b071b0f15d347510d722daacd071838c930249))

## [0.3.0](https://www.github.com/googleapis/java-analytics-admin/compare/v0.2.5...v0.3.0) (2021-01-19)


### ⚠ BREAKING CHANGES

* `update_mask` field is required for all Update operations
* rename `country_code` field to `region_code` in `Account`
* rename `url_query_parameter` field to `uri_query_parameter` in `EnhancedMeasurementSettings`
* remove `parent` field from `GoogleAdsLink`
* remove unused fields from `EnhancedMeasurementSettings` (#137)

### Features

* add pagination support for `ListFirebaseLinks` operation ([6bfa58c](https://www.github.com/googleapis/java-analytics-admin/commit/6bfa58c307adc8a79dd05345299f8e39ddcf32db))


### Bug Fixes

* `update_mask` field is required for all Update operations ([6bfa58c](https://www.github.com/googleapis/java-analytics-admin/commit/6bfa58c307adc8a79dd05345299f8e39ddcf32db))
* remove `parent` field from `GoogleAdsLink` ([6bfa58c](https://www.github.com/googleapis/java-analytics-admin/commit/6bfa58c307adc8a79dd05345299f8e39ddcf32db))
* remove unused fields from `EnhancedMeasurementSettings` ([#137](https://www.github.com/googleapis/java-analytics-admin/issues/137)) ([6bfa58c](https://www.github.com/googleapis/java-analytics-admin/commit/6bfa58c307adc8a79dd05345299f8e39ddcf32db))
* rename `country_code` field to `region_code` in `Account` ([6bfa58c](https://www.github.com/googleapis/java-analytics-admin/commit/6bfa58c307adc8a79dd05345299f8e39ddcf32db))
* rename `url_query_parameter` field to `uri_query_parameter` in `EnhancedMeasurementSettings` ([6bfa58c](https://www.github.com/googleapis/java-analytics-admin/commit/6bfa58c307adc8a79dd05345299f8e39ddcf32db))


### Documentation

* put markdown table in a codeblock ([#132](https://www.github.com/googleapis/java-analytics-admin/issues/132)) ([15ccf20](https://www.github.com/googleapis/java-analytics-admin/commit/15ccf20bf20791d2a0192d67302e40a46a5cf432))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.18.0 ([#136](https://www.github.com/googleapis/java-analytics-admin/issues/136)) ([6d52546](https://www.github.com/googleapis/java-analytics-admin/commit/6d52546b2fc5703571801d5b8045574ad9985bf1))

### [0.2.5](https://www.github.com/googleapis/java-analytics-admin/compare/v0.2.4...v0.2.5) (2020-12-15)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.17.0 ([#126](https://www.github.com/googleapis/java-analytics-admin/issues/126)) ([5b374ef](https://www.github.com/googleapis/java-analytics-admin/commit/5b374efd30dd85b5142c581037150f796908aecb))

### [0.2.4](https://www.github.com/googleapis/java-analytics-admin/compare/v0.2.3...v0.2.4) (2020-12-14)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.16.1 ([#122](https://www.github.com/googleapis/java-analytics-admin/issues/122)) ([2a6832b](https://www.github.com/googleapis/java-analytics-admin/commit/2a6832badbd82e8ab5e8c17dac0a0de23470074d))

### [0.2.3](https://www.github.com/googleapis/java-analytics-admin/compare/v0.2.2...v0.2.3) (2020-12-02)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.16.0 ([#112](https://www.github.com/googleapis/java-analytics-admin/issues/112)) ([166c0d0](https://www.github.com/googleapis/java-analytics-admin/commit/166c0d0a9c4b03a6471417f15c806a2008cc276a))

### [0.2.2](https://www.github.com/googleapis/java-analytics-admin/compare/v0.2.1...v0.2.2) (2020-11-11)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.15.0 ([#102](https://www.github.com/googleapis/java-analytics-admin/issues/102)) ([49b319e](https://www.github.com/googleapis/java-analytics-admin/commit/49b319e61f06abcead5e67a2b67c5476d72cab57))

### [0.2.1](https://www.github.com/googleapis/java-analytics-admin/compare/v0.2.0...v0.2.1) (2020-11-05)


### Bug Fixes

* 'requests' field of CreateUserLink, UpdateUserLink, DeleteUserLink methods is now required ([#96](https://www.github.com/googleapis/java-analytics-admin/issues/96)) ([c15a776](https://www.github.com/googleapis/java-analytics-admin/commit/c15a776d47eb4d28865453281ea7c36b2510892a))

## [0.2.0](https://www.github.com/googleapis/java-analytics-admin/compare/v0.1.4...v0.2.0) (2020-11-02)


### Features

* added ListAccountSummaries method ([#74](https://www.github.com/googleapis/java-analytics-admin/issues/74)) ([128bb78](https://www.github.com/googleapis/java-analytics-admin/commit/128bb7882cf36b5ce05b81fbf63c7cc306d9b655))


### Documentation

* renamed App + Web to Google Analytics 4 (GA4) in public documentation ([#86](https://www.github.com/googleapis/java-analytics-admin/issues/86)) ([22e27ca](https://www.github.com/googleapis/java-analytics-admin/commit/22e27ca307e0b900c1eb89d9872685950ee9e44e))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.12.1 ([#81](https://www.github.com/googleapis/java-analytics-admin/issues/81)) ([58cb9b3](https://www.github.com/googleapis/java-analytics-admin/commit/58cb9b3a3bb64904fafae8ea414ddf729b6b6983))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.13.0 ([#84](https://www.github.com/googleapis/java-analytics-admin/issues/84)) ([5db8220](https://www.github.com/googleapis/java-analytics-admin/commit/5db82207c3e1e056714dc2dbaf3cd62ae3d849c9))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.14.1 ([#91](https://www.github.com/googleapis/java-analytics-admin/issues/91)) ([ac21804](https://www.github.com/googleapis/java-analytics-admin/commit/ac21804451ac2fe557f4cec7b19a7cdb290475e1))

### [0.1.4](https://www.github.com/googleapis/java-analytics-admin/compare/v0.1.3...v0.1.4) (2020-10-08)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.10.2 ([#63](https://www.github.com/googleapis/java-analytics-admin/issues/63)) ([ddc8c2f](https://www.github.com/googleapis/java-analytics-admin/commit/ddc8c2f01efa54fce560c35a235c7d1a3a057c44))

### [0.1.3](https://www.github.com/googleapis/java-analytics-admin/compare/v0.1.2...v0.1.3) (2020-09-23)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.10.0 ([#53](https://www.github.com/googleapis/java-analytics-admin/issues/53)) ([8268d33](https://www.github.com/googleapis/java-analytics-admin/commit/8268d33dd99ee0a220053a9dc2f0a4bea77f8f28))

### [0.1.2](https://www.github.com/googleapis/java-analytics-admin/compare/v0.1.1...v0.1.2) (2020-09-21)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.9.0 ([#34](https://www.github.com/googleapis/java-analytics-admin/issues/34)) ([52df7a7](https://www.github.com/googleapis/java-analytics-admin/commit/52df7a73bb0244e557f714c713d9eb7a700c6a4f))

### [0.1.1](https://www.github.com/googleapis/java-analytics-admin/compare/v0.1.0...v0.1.1) (2020-08-11)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.8.6 ([6461e4c](https://www.github.com/googleapis/java-analytics-admin/commit/6461e4c7935c15a3e553263fa44c689769370369))

## 0.1.0 (2020-07-24)


### Features

* initial generation ([83cb5b3](https://www.github.com/googleapis/java-analytics-admin/commit/83cb5b335c3f2d4ad15eeb3d3bef56b6384ab041))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.8.3 ([#8](https://www.github.com/googleapis/java-analytics-admin/issues/8)) ([42523c3](https://www.github.com/googleapis/java-analytics-admin/commit/42523c34e17451a00ad38c441f7eff2513eea077))
