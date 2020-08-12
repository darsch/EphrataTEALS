# TEALS Codespaces for Ephrata High School
## Creates a Development Container for Java on Visual Studio Codespaces

## Prereqs

To create the Codespace, you'll need the following:

### Azure for Student subscription (or existing Azure subscription)

Creating an Azure for Student subscription is a three-step process.

    1. Create a new Outlook.com email account
    2. Redeem your Student Verification Code
    3. Activate your subscription

`Step 1:` Create a new Outlook.com email account:

Open a new In-Private Browser session and navigate to https://signup.live.com and create a new Outlook.com email account

* Click on the Get A New Email Address button
* Add in the email address you would like to use - if the username is not
available Microsoft will offer several suggestions
* Create a new password for the account
* Add in your name, country/region and date of birth and validate using
Captcha

The account will be created
* Select More Actions and click View Inbox

`Step 2:` Redeeming a Microsoft Azure Student Verification Code:

Open a new In-Private Browser session and navigate to: http://aka.ms/azure4students

It is recommended you close all browsers and open a new In-Private Browser
session. Other logins can persist and cause errors during the activation step.

* Click the `Activate now` button to get started.

* Verify your identity with a phone number
* Enter your 25-character verification code and click `Verify Academic Status`.

`Note` It may take up to 5 minutes to process the redemption.

`Step 3:` Activate your subscription:

* When the redemption process is completed, it will redirect to the sign-up
page.

* Enter your account information and click `Next`.
* Click the agreement check box and click the `Sign up` button.

`Note` It may take a few minutes to process the request.

* Your Azure subscription is ready
* You can check the balance of your Azure Pass Credits on https://www.microsoftazuresponsorships.com/balance


1. Create a new outlook.com email account [HERE](https://account.microsoft.com/)

    * Select `Sign in`, and then choose `Create one!`
    * Choose `Get a new email address`
    * Enter an email name choose `Next`, and then follow the instructions.
    
    Note that the email will need to be available so you may see this message `Someone already has this email address. Try another name or claim one of these that's available`

- A Visual Studio Online environment.  If you don't already have one you can [Create one HERE](https://online.visualstudio.com)

    `` This provides a hosted instance of Visual Studio Code, in which you'll be able to code and run the Java programs for the TEALS lab exercises. ``

1. Click `Get started`

![codespacesGetStarted](https://raw.githubusercontent.com/DataSnowman/TEALS1/master/images/codespacesGetStarted.png)

2. Click `Sign in`

![codespacesSignIn](https://raw.githubusercontent.com/DataSnowman/TEALS1/master/images/codespacesSignIn.png)

### Configure your GitHub

If you don't already have a GitHub Username you can [Create one HERE](https://github.com).  You should use the same email you used to create your Microsoft Account.

1. Click [Here](https://github.com/DataSnowman/EphrataTEALS) and sign in with your GitHub Username

2. Click on Fork in the EphrataTEALS Repository

    - Click on Fork

        ![fork](https://raw.githubusercontent.com/DataSnowman/EphrataTEALS/master/images/fork.png)

    - Click on your GitHub username

        ![forkdest](https://raw.githubusercontent.com/DataSnowman/EphrataTEALS/master/images/forkdest.png)

3. You now have a copy of the EphrataTEALS repository in your GitHub

    ![yourcopy](https://raw.githubusercontent.com/DataSnowman/EphrataTEALS/master/images/yourcopy.png)

    My username was darsch so the repository shows up as darsh/EphrataTEALS.  Yours should be `<GitHubusername>/EphrataTEALS'

4. Set up the codespace environment:

    - Click [HERE](https://online.visualstudio.com/) and sign in using the Microsoft account associated with your Azure subscription.

[![Open in Visual Studio Online](https://img.shields.io/endpoint?style=social&url=https%3A%2F%2Faka.ms%2Fvso-badge)](https://online.visualstudio.com)

## Create a Visual Studio Online Codespace and Container

1. Click `Create Codespace`

![codespacesCreate](https://raw.githubusercontent.com/DataSnowman/EphrataTEALS/master/images/codespacesCreate.png)

- If you don't already have Visual Studio Online plan, create one. This is used to track resource utlization by your Visual Studio Online environments.

![codespacesCreateBillingPlan](https://raw.githubusercontent.com/DataSnowman/EphrataTEALS/master/images/codespacesCreateBillingPlan.png)

    Then create an environment with the following settings:

![codespacesCreateEnv](https://raw.githubusercontent.com/DataSnowman/EphrataTEALS/master/images/codespacesCreateEnv.png)

**Environment Name**: A name for your environment - for example, `Java-Dev`

**Git Repository**: `<GitHubUsername>/EphrataTEALS`

**Instance Type**: `Basic (Linux) 2 cores, 4GB RAM`

**Suspend idle environment after**: `30 minutes`

2. Wait for the environment to be created, and then click `Connect` to connect to it. This will open a browser-based instance of Visual Studio Code.

3. Wait for a minute or so while the environment is set up for you. It might look like nothing is happening, but in the background we are installing some extensions that you will use in the labs. 

4. After the REFRESH NOW file has appeared, refresh the web page to ensure all of the extensions are loaded and you're ready to start.

## Configure GitHub Username and email and Remote for Fork

To open the terminal in your codespace you can ethier use key shortcut

``
Ctrl + `
``

![terminalshortcut](https://raw.githubusercontent.com/DataSnowman/EphrataTEALS/master/images/terminalshortcut.png)

Or use the Application Menu select `Terminal>New Terminal`

![terminalMenu](https://raw.githubusercontent.com/DataSnowman/EphrataTEALS/master/images/terminalMenu.png)

In the terminal copy and paste the following commands:

``pwd
``

``
git status
``

![terminalOutput](https://raw.githubusercontent.com/DataSnowman/TEALS1/master/images/terminalOutput.png)


**Set an username in Git**

Enter with your username replacing `<GitHubusername>`

``
git config --global user.name "<GitHubusername>"
``

Confirm that you have set the username correctly in Git:

Enter

``
git config --global user.name
``

Returns

``
YourGitHubusername
``

**Set an email in Git**

Enter with your email replacing `email@example.com`

``
git config --global user.email "email@example.com"
``

Confirm that you have set the email address correctly in Git:

Enter

``
git config --global user.email
``

Returns

``
Youremail@example.com
``

To list the current configured remote repository for your fork.

Setup Remote Upstream

Enter

``
git remote -v
``

Returns

``
> origin  https://github.com/YOUR_USERNAME/YOUR_FORK.git (fetch)
> origin  https://github.com/YOUR_USERNAME/YOUR_FORK.git (push)
``

Specify a new remote upstream repository that will be synced with the fork.

Enter

``
git remote add upstream https://github.com/DataSnowman/TEALS1.git
``

Verify the new upstream repository you've specified for your fork.

Enter

``
git remote -v
``

Returns

``
> origin    https://github.com/YOUR_USERNAME/YOUR_FORK.git (fetch)
> origin    https://github.com/YOUR_USERNAME/YOUR_FORK.git (push)
> upstream  https://github.com/DataSnowman/TEALS1.git (fetch)
> upstream  https://github.com/DataSnowman/TEALS1.git (push)
``

Pull the upstream repository into your fork.

Enter

``
git pull upstream master
``

## Run HelloWorld Sample

Find the HelloWorld program in sampleCode.  The code should look like this:

``
public class HelloWorld {
    public static void main (String [] args) {
        System.out.println("HelloWorld");
    }
}
``

Click on Run on the sidebar

![run](https://raw.githubusercontent.com/DataSnowman/TEALS1/master/images/run.png)

Click `Run and Debug'

You should get the following output in the terminal

![terminal](https://raw.githubusercontent.com/DataSnowman/TEALS1/master/images/terminal.png)

Congrats! You are ready to right your own programs in the `studentWork` folder

To save you open code you are going to frequently (suggested at the end of every class) run the following command in the terminal to push the changes to your forked repository.

``
git push origin master
``