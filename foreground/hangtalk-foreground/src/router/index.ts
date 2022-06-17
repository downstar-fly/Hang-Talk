import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router';
import LoginPage from '../views/login/loginPage.vue';

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'home',
    component: LoginPage,
  },
  {
    path: '/login',
    name: 'login',
    component: LoginPage,
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
