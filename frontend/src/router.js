
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import UserManagementUserManager from "./components/listers/UserManagementUserCards"
import UserManagementUserDetail from "./components/listers/UserManagementUserDetail"

import MatchingMatchManager from "./components/listers/MatchingMatchCards"
import MatchingMatchDetail from "./components/listers/MatchingMatchDetail"

import ProfileCommunicationCommunicationManager from "./components/listers/ProfileCommunicationCommunicationList"
import ProfileCommunicationCommunicationDetail from "./components/listers/ProfileCommunicationCommunicationDetail"

import SecurityPrivacySecurityManager from "./components/listers/SecurityPrivacySecurityTable"
import SecurityPrivacySecurityDetail from "./components/listers/SecurityPrivacySecurityDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/userManagements/users',
                name: 'UserManagementUserManager',
                component: UserManagementUserManager
            },
            {
                path: '/userManagements/users/:id',
                name: 'UserManagementUserDetail',
                component: UserManagementUserDetail
            },

            {
                path: '/matchings/matches',
                name: 'MatchingMatchManager',
                component: MatchingMatchManager
            },
            {
                path: '/matchings/matches/:id',
                name: 'MatchingMatchDetail',
                component: MatchingMatchDetail
            },

            {
                path: '/profileCommunications/communications',
                name: 'ProfileCommunicationCommunicationManager',
                component: ProfileCommunicationCommunicationManager
            },
            {
                path: '/profileCommunications/communications/:id',
                name: 'ProfileCommunicationCommunicationDetail',
                component: ProfileCommunicationCommunicationDetail
            },

            {
                path: '/securityPrivacies/securities',
                name: 'SecurityPrivacySecurityManager',
                component: SecurityPrivacySecurityManager
            },
            {
                path: '/securityPrivacies/securities/:id',
                name: 'SecurityPrivacySecurityDetail',
                component: SecurityPrivacySecurityDetail
            },



    ]
})
