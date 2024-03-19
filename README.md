# App Usage Stats Tracker

This Android application tracks the usage statistics of apps installed on the device and uploads the data to Firebase Firestore for real-time monitoring.

## Features

- Displays usage statistics of apps for the last 24 hours.
- Uploads app usage data to Firebase Firestore.
- Fetches app usage data from Firebase Firestore for real-time monitoring.

## UsageStatsManager

The `UsageStatsManager` is a system service in Android that provides access to device usage history and statistics. It allows the application to retrieve various usage stats of apps installed on the device, such as:

- Total time spent in the foreground/background by each app.
- Last time the app was used.
- Number of times the app was launched.
- Time when the app was first installed.

### Methods Used:
- `queryUsageStats`: Retrieves the usage statistics of apps for a specific time interval.
- `getTotalTimeInForeground`: Returns the total time an app has been in the foreground.
- `getLastTimeUsed`: Returns the time when the app was last used.
- `getAppLaunchCount`: Returns the number of times the app was launched.

## Firebase Firestore

Firebase Firestore is a NoSQL cloud database provided by Firebase for storing and syncing data in real-time. It enables developers to build serverless applications that automatically sync data between clients in real-time.

### Methods Used:
- `getInstance`: Retrieves an instance of Firestore.
- `collection`: Retrieves a collection reference to a specific Firestore collection.
- `add`: Adds a new document to the Firestore collection.
- `addOnSuccessListener`: Executes a success listener when data is successfully uploaded.
- `addOnFailureListener`: Executes a failure listener when data upload fails.

##Output
 
![pic1](https://github.com/vikassyadav/UsageStatsManger/assets/124931244/74efdfb0-7ced-4a26-abe2-557c2133711c)
![pic2](https://github.com/vikassyadav/UsageStatsManger/assets/124931244/6b120a19-0c5f-4814-863b-293d5f85e41c)


## Installation

To run this application:

1. Clone the repository: `git clone https://github.com/yourusername/app-usage-stats.git`
2. Open the project in Android Studio.
3. Build and run the project on an Android device or emulator.

## Requirements

- Android Studio
- Android SDK
- Google Play services
- Firebase project with Firestore enabled

## Contributing

Contributions are welcome! If you find any bugs or want to add new features, feel free to open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
