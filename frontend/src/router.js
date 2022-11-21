
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import 결재Manager from "./components/listers/결재Cards"
import 결재Detail from "./components/listers/결재Detail"

import 주문처리Manager from "./components/listers/주문처리Cards"
import 주문처리Detail from "./components/listers/주문처리Detail"

import 배달관리Manager from "./components/listers/배달관리Cards"
import 배달관리Detail from "./components/listers/배달관리Detail"

import 알림Manager from "./components/listers/알림Cards"
import 알림Detail from "./components/listers/알림Detail"

import 메뉴선택PreferenceManager from "./components/listers/메뉴선택PreferenceCards"
import 메뉴선택PreferenceDetail from "./components/listers/메뉴선택PreferenceDetail"

import 주문Manager from "./components/listers/주문Cards"
import 주문Detail from "./components/listers/주문Detail"

import 메뉴판View from "./components/메뉴판View"
import 메뉴판ViewDetail from "./components/메뉴판ViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/결재',
                name: '결재Manager',
                component: 결재Manager
            },
            {
                path: '/결재/:id',
                name: '결재Detail',
                component: 결재Detail
            },

            {
                path: '/주문처리',
                name: '주문처리Manager',
                component: 주문처리Manager
            },
            {
                path: '/주문처리/:id',
                name: '주문처리Detail',
                component: 주문처리Detail
            },

            {
                path: '/배달관리',
                name: '배달관리Manager',
                component: 배달관리Manager
            },
            {
                path: '/배달관리/:id',
                name: '배달관리Detail',
                component: 배달관리Detail
            },

            {
                path: '/알림',
                name: '알림Manager',
                component: 알림Manager
            },
            {
                path: '/알림/:id',
                name: '알림Detail',
                component: 알림Detail
            },

            {
                path: '/메뉴선택Preferences',
                name: '메뉴선택PreferenceManager',
                component: 메뉴선택PreferenceManager
            },
            {
                path: '/메뉴선택Preferences/:id',
                name: '메뉴선택PreferenceDetail',
                component: 메뉴선택PreferenceDetail
            },

            {
                path: '/주문',
                name: '주문Manager',
                component: 주문Manager
            },
            {
                path: '/주문/:id',
                name: '주문Detail',
                component: 주문Detail
            },

            {
                path: '/메뉴판',
                name: '메뉴판View',
                component: 메뉴판View
            },
            {
                path: '/메뉴판/:id',
                name: '메뉴판ViewDetail',
                component: 메뉴판ViewDetail
            },


    ]
})
