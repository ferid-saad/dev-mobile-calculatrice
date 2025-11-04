# 🧮 Calculatrice Mobile

<div align="center">

![React Native](https://img.shields.io/badge/React%20Native-0.72-blue?style=for-the-badge&logo=react)
![Android](https://img.shields.io/badge/Android-API%2021%2B-green?style=for-the-badge&logo=android)
![iOS](https://img.shields.io/badge/iOS-12%2B-lightgrey?style=for-the-badge&logo=apple)
![Expo](https://img.shields.io/badge/Expo-49-black?style=for-the-badge&logo=expo)

**Application mobile de calculatrice développée avec React Native et Expo**

[Installation](#-installation) • [Fonctionnalités](#-fonctionnalités) • [Développement](#-développement) • [Build](#-build)

</div>

## 📖 Aperçu du Projet

**Calculatrice Mobile** est une application de calculatrice complète et intuitive développée avec React Native. Elle offre une interface utilisateur moderne avec des fonctionnalités avancées de calcul pour les utilisateurs mobiles.

### 🚀 Démo Rapide

| Plateforme | Commande |
|------------|----------|
| **📱 Android** | `npx expo run:android` |
| **🍎 iOS** | `npx expo run:ios` |
| **🌐 Web** | `npx expo start` puis 'w' |

## 🛠 Stack Technologique

### Frontend Mobile
- **React Native 0.72** - Framework mobile
- **Expo 49** - Plateforme de développement
- **JavaScript/TypeScript** - Langage de programmation
- **React Navigation** - Gestion de navigation

### Styles & UI
- **StyleSheet React Native** - Styles natifs
- **Flexbox** - Disposition responsive
- **Gestures** - Interactions tactiles

### Développement
- **Node.js 18+** - Runtime JavaScript
- **npm/yarn** - Gestion des paquets
- **Git** - Contrôle de version

## 📋 Prérequis

### Pour le Développement
- **Node.js** 18.0 ou supérieur
- **npm** 9.0 ou supérieur **ou** **yarn** 1.22 ou supérieur
- **Git** pour le contrôle de version

### Pour les Builds Natifs
#### Android
- **Android Studio**
- **SDK Android** API 21 ou supérieur
- **Java JDK** 11 ou 17

#### iOS (macOS uniquement)
- **Xcode** 14 ou supérieur
- **macOS** 12.4 ou supérieur
- **CocoaPods** 1.11 ou supérieur

### Optionnel (Recommandé)
- **Expo Go** app sur votre appareil mobile
- **Expo CLI** pour le développement

## ⚡ Installation Rapide

### 1. Cloner le Dépôt

```bash
# Cloner le projet
git clone https://github.com/ferid-saad/dev-mobile-calculatrice.git
cd dev-mobile-calculatrice
```
### 2. Installer les Dépendances
```ini
# Avec npm
npm install

# Ou avec yarn
yarn install
```
### 3. Lancer l'Application
```ini
# Démarrer le serveur de développement
npx expo start

# Ou utiliser npm
npm start

# Ou utiliser yarn
yarn start
```
## 🏗️ Structure du Projet

```ini
text
dev-mobile-calculatrice/
├── 📁 assets/                 # Ressources statiques
│   ├── 📁 icons/             # Icônes de l'application
│   └── 📁 images/            # Images et illustrations
├── 📁 components/            # Composants React réutilisables
│   ├── 📄 Button.js          # Bouton de calculatrice
│   ├── 📄 Display.js         # Écran d'affichage
│   └── 📄 HistoryItem.js     # Élément d'historique
├── 📁 screens/               # Écrans de l'application
│   └── 📄 CalculatorScreen.js # Écran principal calculatrice
├── 📁 utils/                 # Utilitaires et helpers
│   ├── 📄 calculator.js      # Logique de calcul
│   └── 📄 formatters.js      # Formatage des nombres
├── 📁 navigation/            # Configuration de navigation
│   └── 📄 AppNavigator.js    # Navigateur principal
├── 📄 App.js                 # Composant racine
├── 📄 app.json              # Configuration Expo
├── 📄 package.json          # Dépendances du projet
└── 📄 babel.config.js       # Configuration Babel
```

## 👨‍💻 Auteur
Ferid Saad
GitHub: @ferid-saad
Projet: Application mobile Calculatrice





👨‍💻 Auteur
Ferid Saad

GitHub: @ferid-saad

Projet: Application mobile Calculatrice
