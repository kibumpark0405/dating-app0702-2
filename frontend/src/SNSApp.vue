

<template>
    <v-app id="inspire">
        <div>
            <v-app-bar color="primary" app clipped-left flat>
                <v-toolbar-title>
                    <span class="second-word font uppercase"
                        style="font-weight:700;"
                    >
                        <v-app-bar-nav-icon
                            @click="openSideBar()"
                            style="z-index:1;
                            height:56px;
                            width:30px;
                            margin-right:10px;
                            font-weight:300;
                            font-size:55px;"
                        >
                            <div style="line-height:100%;">≡</div>
                        </v-app-bar-nav-icon>
                        dating-app-
                    </span>
                </v-toolbar-title>
                <span v-if="urlPath!=null" 
                    class="mdi mdi-home" 
                    key="" 
                    to="/" 
                    @click="goHome()"
                    style="margin-left:10px; font-size:20px; cursor:pointer;"
		        ></span> 
                <v-spacer></v-spacer>

            </v-app-bar>

            <v-navigation-drawer app clipped flat v-model="sideBar">
                <v-list>
                    <v-list-item
                        class="px-2"
                        key="users"
                        to="/userManagements/users"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        사용자
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="matches"
                        to="/matchings/matches"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        매치
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="communications"
                        to="/profileCommunications/communications"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        커뮤니케이션
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="securities"
                        to="/securityPrivacies/securities"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        보안
                    </v-list-item>


                </v-list>
            </v-navigation-drawer>
        </div>

        <v-main>
            <v-container v-if="urlPath" fluid>
                <router-view></router-view>
            </v-container>
            <v-container v-else class="py-8 px-6 mt-10" fluid>
                <div style="width:86%; margin-left:7%; margin-top:-40px;">
                    <div style="font-size: 24px; font-weight:700; margin:20px 0px 25px 0px;">"지금까지 본 적 없는 최고의 서비스를 체험하세요! 우리의 서비스는 최신 기술과 혁신적인 아이디어로 선보입니다. 언제 어디서든 접속하고 편리한 이용을 즐기세요. 지금 당장 저희와 함께 차원이 다른 서비스를 경험해 보세요!"</div>
                </div>
                <v-row>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px; text-align: center;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="material-symbols-outlined" style="font-size:60px; color:#9575CD;">person</span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="users"
                                            to="/userManagements/users"
                                            @click="changeUrl()"
                                            color="primary"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            사용자
                                        </v-btn>
                                    </template>
                                    <span>사용자</span>
                                </v-tooltip>
                            </v-card-actions>
                            <div style="margin-top:10px;">데이트 앱을 사용하는 개인 또는 소비자</div>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px; text-align: center;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="material-symbols-outlined" style="font-size:60px; color:#9575CD;">favorite</span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="matches"
                                            to="/matchings/matches"
                                            @click="changeUrl()"
                                            color="primary"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            매치
                                        </v-btn>
                                    </template>
                                    <span>매치</span>
                                </v-tooltip>
                            </v-card-actions>
                            <div style="margin-top:10px;">사용자와의 매칭 정보</div>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px; text-align: center;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="material-symbols-outlined" style="font-size:60px; color:#9575CD;">chat</span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="communications"
                                            to="/profileCommunications/communications"
                                            @click="changeUrl()"
                                            color="primary"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            커뮤니케이션
                                        </v-btn>
                                    </template>
                                    <span>커뮤니케이션</span>
                                </v-tooltip>
                            </v-card-actions>
                            <div style="margin-top:10px;">사용자 간의 커뮤니케이션 정보</div>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px; text-align: center;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="material-symbols-outlined" style="font-size:60px; color:#9575CD;">security</span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="securities"
                                            to="/securityPrivacies/securities"
                                            @click="changeUrl()"
                                            color="primary"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            보안
                                        </v-btn>
                                    </template>
                                    <span>보안</span>
                                </v-tooltip>
                            </v-card-actions>
                            <div style="margin-top:10px;">개인 정보 보호 및 데이트 안전 조치</div>
                        </v-card>

                </v-row>
            </v-container>
        </v-main>
    </v-app>
</template>

<script>

export default {
    name: "App",
    data: () => ({
        useComponent: "",
        drawer: true,
        components: [],
        sideBar: true,
        urlPath: null,
    }),
    
    async created() {
      var path = document.location.href.split("#/")
      this.urlPath = path[1];

    },

    mounted() {
        var me = this;
        me.components = this.$ManagerLists;
    },

    methods: {
        openSideBar(){
            this.sideBar = !this.sideBar
        },
        changeUrl() {
            var path = document.location.href.split("#/")
            this.urlPath = path[1];
        },
        goHome() {
            this.urlPath = null;
        },
    }
};
</script>
<style>
</style>
