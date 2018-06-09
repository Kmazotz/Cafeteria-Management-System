﻿namespace App.View
{
    partial class LoginView
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.LoginPanel = new System.Windows.Forms.Panel();
            this.ErrorPwdLabel = new System.Windows.Forms.Label();
            this.LoginButton = new System.Windows.Forms.Button();
            this.ErrorUsrLabel = new System.Windows.Forms.Label();
            this.PasswordTxtBox = new System.Windows.Forms.TextBox();
            this.SinginLabel = new System.Windows.Forms.Label();
            this.UsernameTxtBox = new System.Windows.Forms.TextBox();
            this.ForgotPwdLabel = new System.Windows.Forms.Label();
            this.CoffesoftLabel = new System.Windows.Forms.Label();
            this.TitleBar = new ControlsDesigner.Panels.TitleBar();
            this.LoginPanel.SuspendLayout();
            this.SuspendLayout();
            // 
            // LoginPanel
            // 
            this.LoginPanel.Anchor = System.Windows.Forms.AnchorStyles.Right;
            this.LoginPanel.BackColor = System.Drawing.Color.Transparent;
            this.LoginPanel.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.LoginPanel.Controls.Add(this.CoffesoftLabel);
            this.LoginPanel.Controls.Add(this.ErrorPwdLabel);
            this.LoginPanel.Controls.Add(this.LoginButton);
            this.LoginPanel.Controls.Add(this.ErrorUsrLabel);
            this.LoginPanel.Controls.Add(this.PasswordTxtBox);
            this.LoginPanel.Controls.Add(this.SinginLabel);
            this.LoginPanel.Controls.Add(this.UsernameTxtBox);
            this.LoginPanel.Controls.Add(this.ForgotPwdLabel);
            this.LoginPanel.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LoginPanel.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.LoginPanel.Location = new System.Drawing.Point(360, 84);
            this.LoginPanel.Name = "LoginPanel";
            this.LoginPanel.Size = new System.Drawing.Size(440, 372);
            this.LoginPanel.TabIndex = 9;
            // 
            // ErrorPwdLabel
            // 
            this.ErrorPwdLabel.AutoSize = true;
            this.ErrorPwdLabel.BackColor = System.Drawing.Color.Transparent;
            this.ErrorPwdLabel.Font = new System.Drawing.Font("Segoe UI Semilight", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ErrorPwdLabel.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(232)))), ((int)(((byte)(17)))), ((int)(((byte)(35)))));
            this.ErrorPwdLabel.Location = new System.Drawing.Point(40, 194);
            this.ErrorPwdLabel.Name = "ErrorPwdLabel";
            this.ErrorPwdLabel.Size = new System.Drawing.Size(263, 21);
            this.ErrorPwdLabel.TabIndex = 5;
            this.ErrorPwdLabel.Text = "Su cuenta o contraseña es incorrecta.";
            this.ErrorPwdLabel.Visible = false;
            // 
            // LoginButton
            // 
            this.LoginButton.AutoSize = true;
            this.LoginButton.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(103)))), ((int)(((byte)(184)))));
            this.LoginButton.FlatAppearance.BorderSize = 0;
            this.LoginButton.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.LoginButton.Font = new System.Drawing.Font("Segoe UI Semilight", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LoginButton.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.LoginButton.Location = new System.Drawing.Point(283, 313);
            this.LoginButton.Name = "LoginButton";
            this.LoginButton.Size = new System.Drawing.Size(112, 32);
            this.LoginButton.TabIndex = 0;
            this.LoginButton.Text = "Iniciar Sesión";
            this.LoginButton.UseVisualStyleBackColor = false;
            this.LoginButton.Click += new System.EventHandler(this.LoginButton_Click);
            // 
            // ErrorUsrLabel
            // 
            this.ErrorUsrLabel.BackColor = System.Drawing.Color.Transparent;
            this.ErrorUsrLabel.Font = new System.Drawing.Font("Segoe UI Semilight", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ErrorUsrLabel.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(232)))), ((int)(((byte)(17)))), ((int)(((byte)(35)))));
            this.ErrorUsrLabel.Location = new System.Drawing.Point(39, 99);
            this.ErrorUsrLabel.Name = "ErrorUsrLabel";
            this.ErrorUsrLabel.Size = new System.Drawing.Size(356, 44);
            this.ErrorUsrLabel.TabIndex = 4;
            this.ErrorUsrLabel.Text = "Ingrese una dirección de correo electrónico válida o un nombre de usuario.";
            this.ErrorUsrLabel.Visible = false;
            // 
            // PasswordTxtBox
            // 
            this.PasswordTxtBox.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.PasswordTxtBox.Font = new System.Drawing.Font("Segoe UI", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.PasswordTxtBox.Location = new System.Drawing.Point(44, 222);
            this.PasswordTxtBox.Name = "PasswordTxtBox";
            this.PasswordTxtBox.PasswordChar = '*';
            this.PasswordTxtBox.Size = new System.Drawing.Size(351, 34);
            this.PasswordTxtBox.TabIndex = 2;
            // 
            // SinginLabel
            // 
            this.SinginLabel.AutoSize = true;
            this.SinginLabel.BackColor = System.Drawing.Color.Transparent;
            this.SinginLabel.Font = new System.Drawing.Font("Segoe UI Semilight", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.SinginLabel.Location = new System.Drawing.Point(38, 61);
            this.SinginLabel.Name = "SinginLabel";
            this.SinginLabel.Size = new System.Drawing.Size(127, 32);
            this.SinginLabel.TabIndex = 2;
            this.SinginLabel.Text = "Registrarse";
            // 
            // UsernameTxtBox
            // 
            this.UsernameTxtBox.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.UsernameTxtBox.Font = new System.Drawing.Font("Segoe UI", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.UsernameTxtBox.Location = new System.Drawing.Point(44, 146);
            this.UsernameTxtBox.MaximumSize = new System.Drawing.Size(351, 37);
            this.UsernameTxtBox.MaxLength = 113;
            this.UsernameTxtBox.Name = "UsernameTxtBox";
            this.UsernameTxtBox.Size = new System.Drawing.Size(351, 34);
            this.UsernameTxtBox.TabIndex = 1;
            // 
            // ForgotPwdLabel
            // 
            this.ForgotPwdLabel.AutoSize = true;
            this.ForgotPwdLabel.BackColor = System.Drawing.Color.Transparent;
            this.ForgotPwdLabel.Font = new System.Drawing.Font("Segoe UI Semilight", 9.75F, System.Drawing.FontStyle.Underline, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ForgotPwdLabel.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(103)))), ((int)(((byte)(184)))));
            this.ForgotPwdLabel.Location = new System.Drawing.Point(43, 289);
            this.ForgotPwdLabel.Name = "ForgotPwdLabel";
            this.ForgotPwdLabel.Size = new System.Drawing.Size(127, 17);
            this.ForgotPwdLabel.TabIndex = 3;
            this.ForgotPwdLabel.Text = "Olvide mi contraseña";
            this.ForgotPwdLabel.Click += new System.EventHandler(this.ForgotPwdLabel_Click);
            // 
            // CoffesoftLabel
            // 
            this.CoffesoftLabel.BackColor = System.Drawing.Color.Transparent;
            this.CoffesoftLabel.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CoffesoftLabel.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(199)))), ((int)(((byte)(25)))));
            this.CoffesoftLabel.Image = global::App.Properties.Resources.Coffesoft_Icon;
            this.CoffesoftLabel.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.CoffesoftLabel.Location = new System.Drawing.Point(39, 27);
            this.CoffesoftLabel.Name = "CoffesoftLabel";
            this.CoffesoftLabel.Size = new System.Drawing.Size(123, 25);
            this.CoffesoftLabel.TabIndex = 7;
            this.CoffesoftLabel.Text = "COFFESOFT";
            this.CoffesoftLabel.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // TitleBar
            // 
            this.TitleBar.BackColor = System.Drawing.SystemColors.Highlight;
            this.TitleBar.BarIcon = global::App.Properties.Resources.Coffesoft_Icon;
            this.TitleBar.CloseIcon = global::App.Properties.Resources.Close_Icon;
            this.TitleBar.Dock = System.Windows.Forms.DockStyle.Top;
            this.TitleBar.ForeColor = System.Drawing.Color.White;
            this.TitleBar.Location = new System.Drawing.Point(0, 0);
            this.TitleBar.MaximizeIcon = global::App.Properties.Resources.Maximize_Icon;
            this.TitleBar.MinimizeIcon = global::App.Properties.Resources.Minimize_Icon;
            this.TitleBar.Name = "TitleBar";
            this.TitleBar.Size = new System.Drawing.Size(800, 23);
            this.TitleBar.TabIndex = 15;
            this.TitleBar.TabStop = true;
            this.TitleBar.TitleFont = new System.Drawing.Font("Segoe UI Semibold", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.TitleBar.TitleText = "Login - Coffesoft";
            // 
            // LoginView
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ControlLightLight;
            this.ClientSize = new System.Drawing.Size(800, 600);
            this.Controls.Add(this.TitleBar);
            this.Controls.Add(this.LoginPanel);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "LoginView";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Login";
            this.Load += new System.EventHandler(this.LoginView_Load);
            this.LoginPanel.ResumeLayout(false);
            this.LoginPanel.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.Panel LoginPanel;
        private System.Windows.Forms.Label CoffesoftLabel;
        private System.Windows.Forms.Label ErrorPwdLabel;
        private System.Windows.Forms.Button LoginButton;
        private System.Windows.Forms.Label ErrorUsrLabel;
        private System.Windows.Forms.TextBox PasswordTxtBox;
        private System.Windows.Forms.Label SinginLabel;
        private System.Windows.Forms.TextBox UsernameTxtBox;
        private System.Windows.Forms.Label ForgotPwdLabel;
        private ControlsDesigner.Panels.TitleBar TitleBar;
    }
}